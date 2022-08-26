package com.barclays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

	@GetMapping("/welcome/")
	public String welcome() {
		return "Welcome to Barclays Family..!!";
	}
}
