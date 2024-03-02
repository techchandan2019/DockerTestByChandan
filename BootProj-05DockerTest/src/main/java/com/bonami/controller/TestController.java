package com.bonami.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/message/{msg}")
	public String getMessage(@PathVariable String msg) {
		return msg;
	}
}
