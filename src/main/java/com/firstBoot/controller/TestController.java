package com.firstBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firstBoot.entity.PcrReturn;
import com.firstBoot.service.PcrService;

@RestController
@RequestMapping("pcr")
public class TestController {
	
	@GetMapping("/test")
	public String test() {
		return "Hello World Boot-POC!  " + System.currentTimeMillis();
	}
	
	private PcrService pcrService;

	@Autowired
	public TestController(PcrService thepcrService) {
		pcrService = thepcrService;
	}

	@GetMapping("/returns")
	public List<PcrReturn> findAll() {
		return pcrService.findAll();
	}
	@GetMapping("/returns/{pcrReturnId}")
	public PcrReturn getBookByTitle(@PathVariable("pcrReturnId") int pcrReturnId) {
		PcrReturn theBooks = pcrService.findById(pcrReturnId);

		if (theBooks == null) {
			throw new RuntimeException("The return id not found - " + pcrReturnId);
		}

		return theBooks;
	}

}
