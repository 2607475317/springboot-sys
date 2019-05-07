package com.w.springboot_sys.SrcConfig;



import org.springframework.context.annotation.Configuration;


import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;



//定义MVC的配置类
@Configuration
public class MVCConfig implements WebMvcConfigurer {
        //添加视图映射
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/header").setViewName("header");
        registry.addViewController("/add").setViewName("add");
        registry.addViewController("/toLogin").setViewName("login");
        //registry.addViewController("/main").setViewName("main");
        registry.addViewController("/menu").setViewName("menu");

    }

}
