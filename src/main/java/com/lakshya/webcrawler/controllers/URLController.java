package com.lakshya.webcrawler.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lakshya.webcrawler.entities.PageInfo;
import com.lakshya.webcrawler.services.PageInfoService;

@RestController
public class URLController {

	@Autowired
	private PageInfoService pageInfoService;

	@GetMapping("/url")
	public String hello() {
		return String.format("Hello Lakhsya");
	}

	@PostMapping("/pageInfo")
	public boolean hello(@RequestBody PageInfo pageInfo) {
		return pageInfoService.save(pageInfo);
	}
}
