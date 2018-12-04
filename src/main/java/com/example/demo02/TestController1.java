package com.example.demo02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController1 {

    @Value("${phone}")
	private String phone;
	@RequestMapping("/hehehe")
	public String hello(){
		return "hello springboot" + "&nbsp" + phone;
	}
}
