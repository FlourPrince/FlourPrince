package com.example.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/hello")
public class Controller {
@RequestMapping("")
	private String hello() {
		return "Hello World";
	}
}
