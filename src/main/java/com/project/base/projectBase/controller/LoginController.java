package com.project.base.projectBase.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.base.projectBase.dto.LoginResponseDTO;
import com.project.base.projectBase.dto.ResponseDTO;
import com.project.base.projectBase.model.Login;

@RestController
public class LoginController {

	@RequestMapping(value= "/login", method = RequestMethod.POST, produces = "application/json")
	public LoginResponseDTO getDocInput(@RequestBody Login login){
		LoginResponseDTO response = new LoginResponseDTO();
		
		if(login.getUserName().contentEquals("admin") && login.getPassword().contentEquals("admin")){
			response.setMessage("Inicio valido");
			response.setSuccessful(true);
		}else {
			response.setMessage("Inicio no valido");
			response.setSuccessful(false);
		}
		return response;
		
	}
}
