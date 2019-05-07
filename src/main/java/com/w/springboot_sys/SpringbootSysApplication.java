package com.w.springboot_sys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.cache.annotation.EnableCaching;

@MapperScan("com.w.springboot_sys.dao")//扫描包
@EnableCaching
@SpringBootApplication
public class SpringbootSysApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSysApplication.class, args);
	}
}
