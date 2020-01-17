package com.kuang.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kuang.dao.User;
import com.kuang.service.UserService;

@Controller
public class UserController {
    private static final Logger log = LoggerFactory.getLogger(UserController.class);

	@Autowired
    UserService userService;
	
    //http://localhost:8090/show?xuhao=4
	 /**
     *  获取用户列表
     *    处理 "/users" 的GET请求，用来获取用户列表
     *    通过 @RequestParam 传递参数，进一步实现条件查询或者分页查询
     */
    @RequestMapping(value="/show",method = RequestMethod.GET)
    public String getUser(HttpServletRequest req,ModelMap ModelMap){
    	
    	List<User> lst = userService.getUserAll();
    	log.debug(lst.toString());
    	ModelMap.addAttribute("userList", lst);
         return "userList";
   
    }
    
    @RequestMapping("/test")
    public String test() {
    	log.info("test+++++");
    	return "register";
    }
}
