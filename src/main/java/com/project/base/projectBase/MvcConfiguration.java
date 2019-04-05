package com.project.base.projectBase;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;


@Configuration
@EnableWebMvc
@ComponentScan({"com.project.base.projectBase", "com.project.base.psrojectBase.controller", 
	"com.project.base.projectBase.service", "com.project.base.projectBase.model"})
public class MvcConfiguration implements WebMvcConfigurer {
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer){
		configurer.enable();
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**") /*Permite manejar la ruta statica*/
		//.addResourceLocations("/resources/"); 		  /*Se coloca la ubicacion de los recursos*/
		.addResourceLocations("/resources/"); 		  /*Apunta al static */
	}
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/login").setViewName("/login/login");
		registry.addViewController("/index").setViewName("/index/index");

	}
	
	@Bean
	public ViewResolver getViewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/");
//		resolver.setSuffix(".jsp");
		resolver.setSuffix(".html");
//		resolver.setViewClass(JstlView.class);
		return resolver;
	}
}
