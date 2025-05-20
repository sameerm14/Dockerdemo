package com.doker.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Control {

	@GetMapping("/message")
	public String getMessage() {
		return "Hello Sammy How are you";
	}
}
