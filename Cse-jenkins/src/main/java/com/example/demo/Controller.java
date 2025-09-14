package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
		@GetMapping("/rocks")
	public String hello() {
		return "Jenkins first project rocks!";
	}

}
