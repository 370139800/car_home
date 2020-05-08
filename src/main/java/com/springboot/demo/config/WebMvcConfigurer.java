package com.springboot.demo.config;

import com.springboot.demo.interceptor.BPLoginInteceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 拦截器的配置
 * @author wuqianhui
 *
 */
@Configuration
public class WebMvcConfigurer extends WebMvcConfigurerAdapter{

    //后台登录拦截器配置
    @Bean
    public BPLoginInteceptor getLoginIntercepter() {
        return new BPLoginInteceptor();
    }

    
    @Override
    public void addInterceptors(InterceptorRegistry registry){
    	registry.addInterceptor(getLoginIntercepter())
    	.addPathPatterns("/**");
    }
}
