package com.kuang.service;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.kuang.controller.UserController;
import com.kuang.dao.User;
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {"cn.kuang.controller","cn.kuang.service"})
@MapperScan(basePackages = "cn.kuang.dao")
public class Test {
	public static void main(String[] args) {
		System.out.println("1111");
		UserController UserController=new UserController();
		System.out.println("2222");
		List<User> lstUser=	UserController.getUser(1);
	       System.out.println(lstUser+"++++++++++");
	}
}
