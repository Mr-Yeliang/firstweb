package com.example.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping("/")
	public String index() {
		return "I am 叶亮，my Email is 1601833794@qq.com";
	}
}
