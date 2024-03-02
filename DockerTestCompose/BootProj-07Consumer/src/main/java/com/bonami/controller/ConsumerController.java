package com.bonami.controller;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

	@GetMapping("/msg")
	public ResponseEntity<String> getMessage() {
		RestTemplate template=new RestTemplate();
		ResponseEntity<String> exchange = template.exchange("http://BootProj-07Producer:4042/producer/msg",HttpMethod.GET, null,String.class);
		return exchange;
	}
}
