package com.bonami.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
public class ProducerController {

	@GetMapping("/msg")
	public ResponseEntity<String> getMessage() {
		return new ResponseEntity<>("Hi,Good Morning",HttpStatus.OK);
	}
}
