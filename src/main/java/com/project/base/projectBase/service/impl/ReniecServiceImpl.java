package com.project.base.projectBase.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.base.projectBase.dto.ResponseDTO;
import com.project.base.projectBase.model.Reniec;
import com.project.base.projectBase.model.ReniecRepository;
import com.project.base.projectBase.service.ReniecService;

public class ReniecServiceImpl implements ReniecService{
	@Autowired
	ReniecRepository reniecRepository;
	
	@Override
	public ResponseDTO<String> getCodUser(String inputData) {
		ResponseDTO<String> response = new ResponseDTO<>();
		Reniec reniec = new Reniec();
		try {
			reniec = reniecRepository.getCodReniec(inputData);
			if(reniec == null) {
				response.setRespuestaReniec("No se encontro Documento");
				return response;
			}
		} catch(Exception e) {
			
		}
		
		return response;
	}

}
