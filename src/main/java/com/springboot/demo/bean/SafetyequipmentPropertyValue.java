package com.springboot.demo.bean;

import java.util.Objects;

/**
 * 主/被动安全装备
 */
public class SafetyequipmentPropertyValue {

    private Integer id;
    private Integer ccategoryId;
    private String airbag; //  主/副驾驶座安全气囊
    private String sideairbag; //前/后排侧气囊
    private String headairbag; //前/后排头部气囊(气帘)
    private String kneeairbag; //膝部气囊
    private String safebeltairbag; //后排安全带式气囊
    private String centersafeairbag; //后排中央安全气囊
    private String passivepedestrianprotection; //被动行人保护
    private String tirepressuremonitoring; //胎压监测功能
    private String zerotirecontinue; //零胎压继续形式
    private String seatbeltnotfastened; //安全带未系提醒
    private String childseatjoint; //ISOFIX儿童座椅接口
    private String abs; //ABS防抱死
    private String ebd; //制动力分类(EBD/CBC等)
    private String eba; //刹车辅助(EBA/BAS/BA等)
    private String asr; //牵引力控制(ASR/TCS/TRC等)
    private String esc; //车身稳定控制(ESC/ESP/DES等)
    private String doublingauxiliary; //并线辅助
    private String fromearlywarning; //车道偏离预警系统
    private String keepassist; //车道保持辅助系统
    private String trafficsign; //道路交通标识识别
    private String activebrake; //主动刹车/主动安全系统
    private String nightsight; //夜视系统
    private String fatiguedrivingtip; //疲劳驾驶提示

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCcategoryId() {
        return ccategoryId;
    }

    public void setCcategoryId(Integer ccategoryId) {
        this.ccategoryId = ccategoryId;
    }

    public String getAirbag() {
        return airbag;
    }

    public void setAirbag(String airbag) {
        this.airbag = airbag;
    }

    public String getSideairbag() {
        return sideairbag;
    }

    public void setSideairbag(String sideairbag) {
        this.sideairbag = sideairbag;
    }

    public String getHeadairbag() {
        return headairbag;
    }

    public void setHeadairbag(String headairbag) {
        this.headairbag = headairbag;
    }

    public String getKneeairbag() {
        return kneeairbag;
    }

    public void setKneeairbag(String kneeairbag) {
        this.kneeairbag = kneeairbag;
    }

    public String getSafebeltairbag() {
        return safebeltairbag;
    }

    public void setSafebeltairbag(String safebeltairbag) {
        this.safebeltairbag = safebeltairbag;
    }

    public String getCentersafeairbag() {
        return centersafeairbag;
    }

    public void setCentersafeairbag(String centersafeairbag) {
        this.centersafeairbag = centersafeairbag;
    }

    public String getPassivepedestrianprotection() {
        return passivepedestrianprotection;
    }

    public void setPassivepedestrianprotection(String passivepedestrianprotection) {
        this.passivepedestrianprotection = passivepedestrianprotection;
    }

    public String getTirepressuremonitoring() {
        return tirepressuremonitoring;
    }

    public void setTirepressuremonitoring(String tirepressuremonitoring) {
        this.tirepressuremonitoring = tirepressuremonitoring;
    }

    public String getZerotirecontinue() {
        return zerotirecontinue;
    }

    public void setZerotirecontinue(String zerotirecontinue) {
        this.zerotirecontinue = zerotirecontinue;
    }

    public String getSeatbeltnotfastened() {
        return seatbeltnotfastened;
    }

    public void setSeatbeltnotfastened(String seatbeltnotfastened) {
        this.seatbeltnotfastened = seatbeltnotfastened;
    }

    public String getChildseatjoint() {
        return childseatjoint;
    }

    public void setChildseatjoint(String childseatjoint) {
        this.childseatjoint = childseatjoint;
    }

    public String getAbs() {
        return abs;
    }

    public void setAbs(String abs) {
        this.abs = abs;
    }

    public String getEbd() {
        return ebd;
    }

    public void setEbd(String ebd) {
        this.ebd = ebd;
    }

    public String getEba() {
        return eba;
    }

    public void setEba(String eba) {
        this.eba = eba;
    }

    public String getAsr() {
        return asr;
    }

    public void setAsr(String asr) {
        this.asr = asr;
    }

    public String getEsc() {
        return esc;
    }

    public void setEsc(String esc) {
        this.esc = esc;
    }

    public String getDoublingauxiliary() {
        return doublingauxiliary;
    }

    public void setDoublingauxiliary(String doublingauxiliary) {
        this.doublingauxiliary = doublingauxiliary;
    }

    public String getFromearlywarning() {
        return fromearlywarning;
    }

    public void setFromearlywarning(String fromearlywarning) {
        this.fromearlywarning = fromearlywarning;
    }

    public String getKeepassist() {
        return keepassist;
    }

    public void setKeepassist(String keepassist) {
        this.keepassist = keepassist;
    }

    public String getTrafficsign() {
        return trafficsign;
    }

    public void setTrafficsign(String trafficsign) {
        this.trafficsign = trafficsign;
    }

    public String getActivebrake() {
        return activebrake;
    }

    public void setActivebrake(String activebrake) {
        this.activebrake = activebrake;
    }

    public String getNightsight() {
        return nightsight;
    }

    public void setNightsight(String nightsight) {
        this.nightsight = nightsight;
    }

    public String getFatiguedrivingtip() {
        return fatiguedrivingtip;
    }

    public void setFatiguedrivingtip(String fatiguedrivingtip) {
        this.fatiguedrivingtip = fatiguedrivingtip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SafetyequipmentPropertyValue that = (SafetyequipmentPropertyValue) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(ccategoryId, that.ccategoryId) &&
                Objects.equals(airbag, that.airbag) &&
                Objects.equals(sideairbag, that.sideairbag) &&
                Objects.equals(headairbag, that.headairbag) &&
                Objects.equals(kneeairbag, that.kneeairbag) &&
                Objects.equals(safebeltairbag, that.safebeltairbag) &&
                Objects.equals(centersafeairbag, that.centersafeairbag) &&
                Objects.equals(passivepedestrianprotection, that.passivepedestrianprotection) &&
                Objects.equals(tirepressuremonitoring, that.tirepressuremonitoring) &&
                Objects.equals(zerotirecontinue, that.zerotirecontinue) &&
                Objects.equals(seatbeltnotfastened, that.seatbeltnotfastened) &&
                Objects.equals(childseatjoint, that.childseatjoint) &&
                Objects.equals(abs, that.abs) &&
                Objects.equals(ebd, that.ebd) &&
                Objects.equals(eba, that.eba) &&
                Objects.equals(asr, that.asr) &&
                Objects.equals(esc, that.esc) &&
                Objects.equals(doublingauxiliary, that.doublingauxiliary) &&
                Objects.equals(fromearlywarning, that.fromearlywarning) &&
                Objects.equals(keepassist, that.keepassist) &&
                Objects.equals(trafficsign, that.trafficsign) &&
                Objects.equals(activebrake, that.activebrake) &&
                Objects.equals(nightsight, that.nightsight) &&
                Objects.equals(fatiguedrivingtip, that.fatiguedrivingtip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ccategoryId, airbag, sideairbag, headairbag, kneeairbag, safebeltairbag, centersafeairbag, passivepedestrianprotection, tirepressuremonitoring, zerotirecontinue, seatbeltnotfastened, childseatjoint, abs, ebd, eba, asr, esc, doublingauxiliary, fromearlywarning, keepassist, trafficsign, activebrake, nightsight, fatiguedrivingtip);
    }

    @Override
    public String toString() {
        return "SafetyequipmentPropertyValue{" +
                "id=" + id +
                ", ccategoryId=" + ccategoryId +
                ", airbag='" + airbag + '\'' +
                ", sideairbag='" + sideairbag + '\'' +
                ", headairbag='" + headairbag + '\'' +
                ", kneeairbag='" + kneeairbag + '\'' +
                ", safebeltairbag='" + safebeltairbag + '\'' +
                ", centersafeairbag='" + centersafeairbag + '\'' +
                ", passivepedestrianprotection='" + passivepedestrianprotection + '\'' +
                ", tirepressuremonitoring='" + tirepressuremonitoring + '\'' +
                ", zerotirecontinue='" + zerotirecontinue + '\'' +
                ", seatbeltnotfastened='" + seatbeltnotfastened + '\'' +
                ", childseatjoint='" + childseatjoint + '\'' +
                ", abs='" + abs + '\'' +
                ", ebd='" + ebd + '\'' +
                ", eba='" + eba + '\'' +
                ", asr='" + asr + '\'' +
                ", esc='" + esc + '\'' +
                ", doublingauxiliary='" + doublingauxiliary + '\'' +
                ", fromearlywarning='" + fromearlywarning + '\'' +
                ", keepassist='" + keepassist + '\'' +
                ", trafficsign='" + trafficsign + '\'' +
                ", activebrake='" + activebrake + '\'' +
                ", nightsight='" + nightsight + '\'' +
                ", fatiguedrivingtip='" + fatiguedrivingtip + '\'' +
                '}';
    }
}
