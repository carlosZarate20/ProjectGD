package com.project.base.projectBase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.base.projectBase.dto.ResponseDTO;
import com.project.base.projectBase.service.ReniecService;

@RestController
public class HomeController {
	
	@Autowired
	ReniecService reniecservice;
	
	@GetMapping("/")
    public String index() {
        return "Hello there! I'm running.";
    }
	
	@PostMapping("/getDoc")
	public ResponseDTO<String> getDocInput(@RequestParam String inputData){
		ResponseDTO<String> response = new ResponseDTO<>();
		response = reniecservice.getCodUser(inputData);
		return response;
		
	}
}
