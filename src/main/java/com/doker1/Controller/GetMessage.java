package com.doker1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetMessage {

	@GetMapping("/jenkin")
	public String message() {
		return "Jenkins Setup finished";
	}
}
