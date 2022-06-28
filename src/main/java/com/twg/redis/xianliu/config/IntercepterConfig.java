package com.twg.redis.xianliu.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 访问拦截器配置
 * @author twg
 *
 */
@Configuration
public class IntercepterConfig implements WebMvcConfigurer {

	@Autowired
	private AccessLimitInterceptor interceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		registry.addInterceptor(interceptor)//添加拦截配置
        .addPathPatterns("/**")	//添加拦截路径
        .excludePathPatterns("/static/**","/login.html","/user/login");//排除拦截路径
	}
}
