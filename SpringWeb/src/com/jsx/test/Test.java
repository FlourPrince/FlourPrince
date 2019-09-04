package com.jsx.test;



import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jsx.pojo.User;
import com.jsx.service.UserService;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext*.xml");
        System.out.println("111111");
        System.out.println(Arrays.toString(ctx.getBeanDefinitionNames()));
		 UserService us =(UserService) ctx.getBean("userService");
		/*
		 * User user= new User(); user.setUsername("¿ÓÀƒ");
		 * user.setPassword("1111"); user= us.login(user);
		 * System.out.println(user.getXuhao()); System.out.println("333");
		 */
			   User user= new User();
			 user.setPassword("11111");
			 user.setUsername("’‘Àƒ");
		        System.out.println("222222");
			 Boolean b= us.register(user);
			 System.out.println(b);
			   System.out.println("333");
	}
}
