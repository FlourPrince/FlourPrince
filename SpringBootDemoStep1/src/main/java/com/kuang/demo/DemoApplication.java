package com.kuang.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * ComponentScan注解扫描处理器和业务层
 * MapperScan注解扫描dao层
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.kuang.*","com.kuang.*"})
@MapperScan(basePackages = "com.kuang.dao")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
