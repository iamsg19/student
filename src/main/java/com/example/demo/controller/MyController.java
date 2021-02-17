package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

	@GetMapping("/data")
	public ResponseEntity<String> getData() {

		return new ResponseEntity<String>("<h1 style='color:red'> Shivaji Chandra </h1>", HttpStatus.OK);
	}
}
