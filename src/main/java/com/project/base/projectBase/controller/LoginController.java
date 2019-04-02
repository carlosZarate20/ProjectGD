package com.project.base.projectBase.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.base.projectBase.dto.ResponseDTO;

public class LoginController {

	@PostMapping("/login")
	public ResponseDTO<String> getDocInput(@RequestParam String userName, @RequestParam String password){
		ResponseDTO<String> response = new ResponseDTO<>();
		return response;
		
	}
}
