package com.example.demo_test;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/ping")
@RestController
public class HealthController {

	@GetMapping(value = "/v1")
	public Object ping() {
		return ResponseEntity.ok("Hello world!!!");
	}


}
