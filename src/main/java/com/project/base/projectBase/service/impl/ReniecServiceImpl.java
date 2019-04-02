package com.project.base.projectBase.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.base.projectBase.dao.SelectDocDao;
import com.project.base.projectBase.dto.ResponseDTO;
import com.project.base.projectBase.model.Reniec;
import com.project.base.projectBase.service.ReniecService;

@Service
public class ReniecServiceImpl implements ReniecService{
	@Autowired
	private SelectDocDao selectDocDao;
	@Override
	public ResponseDTO<String> getCodUser(String inputData) {
		ResponseDTO<String> response = new ResponseDTO<>();
		Integer resultReniec = null;
		Integer resultBase = null;
		Integer resultRcc = null;
		Integer resultBuro = null;
		try {
			resultReniec = selectDocDao.getDocReniec(inputData);
			if(resultReniec == 0) {
				response.setRespuestaReniec("Desaprobada por Reniec");
				response.setIsValid(0L);
				return response;
			}
			resultBase = selectDocDao.getDocBaseCampana(inputData);
			if(resultBase == 1) {
				response.setRespuestaBaseCampana("Oferta Aprobada");
				response.setIsValid(1L);
				return response;
			}
			resultRcc = selectDocDao.getDocBaseRcc(inputData);
			resultBuro = selectDocDao.getDocBaseBuro(inputData);
			
			if(resultRcc == 0) {
				response.setRespuestaRcc("Desaprobado por Rcc");
				response.setIsValid(2L);
				return response;
			}
			if(resultBuro == 0) {
				response.setRespuestaRuc("Desaprobado por Rubo");
				response.setIsValid(3L);
				return response;
			}
			if(resultRcc == 0 && resultBuro == 0) {
				response.setRespuestaRccAndRuc("Desaprobado por Rcc y Rubo");
				response.setIsValid(4L);
				return response;
			}
			response.setRespuestaGeneral("Aprobado");
			response.setIsValid(5L);
			
		} catch(Exception e) {
			
		}
		
		return response;
	}

}
