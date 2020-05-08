package com.springboot.demo.controller;

import com.github.pagehelper.PageInfo;
import com.springboot.demo.bean.Review;
import com.springboot.demo.service.ReviewService;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * 评论控制层
 */
@RestController
@RequestMapping("/review")
public class ReviewController {

    @Resource
    ReviewService reviewService;

    /**
     * 查找所有评论
     * @param start
     * @param size
     * @return
     */
    @RequestMapping("/listReview")
    public PageInfo<Review> listReview(@RequestParam(value = "start" , defaultValue = "1") Integer start ,
                                        @RequestParam(value = "size" , defaultValue = "8") Integer size,
                                        String ccname,Integer status){
        Review review = new Review();
        review.setCcname(ccname);
        review.setStatus(status);
        if(start == null || start < 1){
            start = 1;
        }
        return  reviewService.findAllReview(start,size,review);
    }

    /**
     * 删除评论
     * @param id
     * @return
     */
    @RequestMapping("/deleteReview")
    public String deleteReview(Integer id){
        reviewService.deleteReview(id);
        return "删除成功";
    }

    /**
     * 修改审核状态
     * @return
     */
    @RequestMapping("/updateStatus")
    public String updateStatus(Integer id,Integer status){
        Review review = new Review();
        review.setId(id);
        review.setStatus(status);
        reviewService.updateStatus(review);
        return "修改状态成功";
    }

    /**
     * 完成导入操作
     * @param file
     * @return
     */
    @RequestMapping("/importReview")
    public String importReview(MultipartFile file, HttpServletRequest request) throws IOException {
        File imageFolder= new File(request.getServletContext().getRealPath("xls/review"));
        String s = file.getOriginalFilename();
        File excel = new File(imageFolder,s);
        file.transferTo(excel);
        Review review = new Review(); //创建评论对象
        try {
            if (excel.isFile() && excel.exists()) {   //判断文件是否存在

                String[] split = excel.getName().split("\\.");  //.是特殊字符，需要转义！！！！！
                Workbook wb;
                //根据文件后缀（xls/xlsx）进行判断
                if ( "xls".equals(split[1])){
                    FileInputStream fis = new FileInputStream(excel);   //文件流对象
                    wb = new HSSFWorkbook(fis);
                }else if ("xlsx".equals(split[1])){
                    wb = new XSSFWorkbook(excel);
                }else {
                    return "";
                }

                //开始解析
                Sheet sheet = wb.getSheetAt(0);     //读取sheet 0
                int firstRowIndex = sheet.getFirstRowNum()+1;   //第一行是列名，所以不读
                int lastRowIndex = sheet.getLastRowNum();
                for(int rIndex = firstRowIndex; rIndex <= lastRowIndex; rIndex++) {   //遍历行
                    Row row = sheet.getRow(rIndex);
                    /*if (row != null) {
                        int firstCellIndex = row.getFirstCellNum();
                        int lastCellIndex = row.getLastCellNum();
                        for (int cIndex = firstCellIndex; cIndex < lastCellIndex; cIndex++) {   //遍历列
                            Cell cell = row.getCell(cIndex);
                            if (cell != null) {
                                System.out.println(cell.toString());
                            }
                        }
                    }*/
                    if (row != null) {//保存表格信息
                        review.setCarId((int)(Double.parseDouble(row.getCell(0).toString())));
                        review.setReview(row.getCell(1).toString());
                        review.setCreateBy((int)(Double.parseDouble(row.getCell(2).toString())));
                        System.out.println(review);
                        //插入数据
                        reviewService.insertReview(review);
                    }
                }
            } else {
                System.out.println("找不到指定的文件");
                return "";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "导入失败,请添加对应字段值";
        }
        return "导入成功";
    }


    /**
     * 评论导出Excel
     * 创建表头
     */
    private void createTitle(HSSFWorkbook workbook, HSSFSheet sheet){
        HSSFRow row = sheet.createRow(0);
        //设置列宽，setColumnWidth的第二个参数要乘以256，这个参数的单位是1/256个字符宽度
        sheet.setColumnWidth(2, 12*256);
        sheet.setColumnWidth(3, 17*256);
        //设置为居中加粗
        HSSFCellStyle style = workbook.createCellStyle();
        HSSFFont font = workbook.createFont();
        font.setBold(true);
        style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
        style.setFont(font);

        HSSFCell cell;
        cell = row.createCell(0);
        cell.setCellValue("id");
        cell.setCellStyle(style);

        cell = row.createCell(1);
        cell.setCellValue("用户名");
        cell.setCellStyle(style);

        cell = row.createCell(2);
        cell.setCellValue("系列");
        cell.setCellStyle(style);

        cell = row.createCell(3);
        cell.setCellValue("款式");
        cell.setCellStyle(style);

        cell = row.createCell(4);
        cell.setCellValue("状态");
        cell.setCellStyle(style);


        cell = row.createCell(5);
        cell.setCellValue("评语");
        cell.setCellStyle(style);


        cell = row.createCell(6);
        cell.setCellValue("创建时间");
        cell.setCellStyle(style);
    }

    /**
     * 导出excle
     * @param response
     * @throws IOException
     */
    @RequestMapping("/getExcel")
    public void getExcel(String ccname,Integer status,HttpServletResponse response) throws IOException {
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("评论表");
        createTitle(workbook,sheet);
        List<Review> reviews;  //存放查出来的评论数据

        //创建一个对象
        Review review1 = new Review();
        if(ccname==null){
            ccname="";
        }
        review1.setCcname(ccname);
        if(status==null) {
            status=3;
        }
        review1.setStatus(status);

        //查询所有评论数据
        reviews = reviewService.getListReview(review1);
        //设置日期格式
        HSSFCellStyle style=workbook.createCellStyle();
        style.setDataFormat(HSSFDataFormat.getBuiltinFormat("m/d/yy h:mm"));
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //新增数据行，并且设置单元格数据
        int rowNum = 1;
        for(Review review : reviews){
            HSSFRow row = sheet.createRow(rowNum);
            row.createCell(0).setCellValue(review.getId());  //id
            row.createCell(1).setCellValue(review.getUname()); //用户名
            row.createCell(2).setCellValue(review.getCcname()); //系列名
            row.createCell(3).setCellValue(review.getCname()); //款式
            String statusName = "";
            if(review.getStatus()==0){
                statusName = "未审核";
            }else if (review.getStatus()==1){
                statusName = "审核未通过";
            }else if (review.getStatus()==2){
                statusName = "审核通过";
            }
            row.createCell(4).setCellValue(statusName);   //状态名
            row.createCell(5).setCellValue(review.getReview());  //评语
            row.createCell(6).setCellValue(dateFormat.format(review.getCreateTime())); //创建时间
            rowNum++;
        }
        // 评论表名称
        String fileName = "评论表.xls";
        String dateTime = dateFormat.format(new Date());
        String blobName =  dateTime + "/" + UUID.randomUUID().toString().replaceAll("-", "") + "/" + fileName;
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/octet-stream");
        response.setHeader("Content-disposition", "attachment;filename="+new String(blobName.getBytes("UTF-8"),"ISO8859-1"));
        //刷新缓冲
        response.flushBuffer();
        workbook.write(response.getOutputStream());
        workbook.close();
    }

}
