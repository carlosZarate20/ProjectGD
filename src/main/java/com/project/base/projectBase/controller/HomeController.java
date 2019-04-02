package com.project.base.projectBase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.base.projectBase.dto.ResponseDTO;
import com.project.base.projectBase.model.Reniec;
import com.project.base.projectBase.service.ReniecService;

@RestController
public class HomeController {
	
	@Autowired
	private ReniecService reniecservice;
	
	@RequestMapping(value = "/getDoc", method = RequestMethod.POST, produces = "application/json")
	public ResponseDTO<String> getDocInput(@RequestBody Reniec reniec){
		ResponseDTO<String> response = new ResponseDTO<>();
		response = reniecservice.getCodUser(reniec.getDocIdentidad());
		return response;
	}
}
