package com.springboot.demo.config;

import com.springboot.demo.realm.DatabaseRealm;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * shiro配置
 * @author wuqianhui
 *
 */
@Configuration
public class ShiroConfiguration {
	
	 @Bean
	    public static LifecycleBeanPostProcessor getLifecycleBeanPostProcessor() {
	        return new LifecycleBeanPostProcessor();
	    }
	 
	    @Bean
	    public ShiroFilterFactoryBean shirFilter(SecurityManager securityManager){
	        ShiroFilterFactoryBean shiroFilterFactoryBean  = new ShiroFilterFactoryBean();
	        shiroFilterFactoryBean.setSecurityManager(securityManager);
			shiroFilterFactoryBean.setLoginUrl("/backstagelogin");
	        return shiroFilterFactoryBean;
	    }

	/**
	 * 安全管理器
 	 * @return
	 */
	@Bean
	    public SecurityManager securityManager(){
	        DefaultWebSecurityManager securityManager =  new DefaultWebSecurityManager();
	        securityManager.setRealm(getDatabaseRealm());
	        return securityManager;
	    }
	    
	    /**
	     * 指定Realm使用DatabaseRealm
	     * @return
	     */
	    @Bean
	    public Realm getDatabaseRealm(){
			DatabaseRealm myShiroRealm = new DatabaseRealm();
	        myShiroRealm.setCredentialsMatcher(hashedCredentialsMatcher());
	        return myShiroRealm;
	    }
	    
	    /**
	     * 使用md5加密算法,并进行两次加密
	     * @return
	     */
	    @Bean
	    public HashedCredentialsMatcher hashedCredentialsMatcher(){
	        HashedCredentialsMatcher hashedCredentialsMatcher = new HashedCredentialsMatcher();
	        hashedCredentialsMatcher.setHashAlgorithmName("md5");
	        hashedCredentialsMatcher.setHashIterations(2);
	        return hashedCredentialsMatcher;
	    }
	 
	    /**
	     *  开启shiro aop注解支持.
	     *  使用代理方式;所以需要开启代码支持;
	     * @param securityManager
	     * @return
	     */
	    @Bean
	    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(SecurityManager securityManager){
	        AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor = new AuthorizationAttributeSourceAdvisor();
	        authorizationAttributeSourceAdvisor.setSecurityManager(securityManager);
	        return authorizationAttributeSourceAdvisor;
	    }
}
