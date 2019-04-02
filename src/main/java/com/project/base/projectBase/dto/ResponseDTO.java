package com.project.base.projectBase.dto;


public class ResponseDTO <A> {
	private String respuestaReniec;
	private String respuestaBaseCampana;
	private String respuestaRcc;
	private String respuestaBuro;
	
	public ResponseDTO() {
		super();

	}

	public String getRespuestaReniec() {
		return respuestaReniec;
	}

	public void setRespuestaReniec(String respuestaReniec) {
		this.respuestaReniec = respuestaReniec;
	}

	public String getRespuestaBaseCampana() {
		return respuestaBaseCampana;
	}

	public void setRespuestaBaseCampana(String respuestaBaseCampana) {
		this.respuestaBaseCampana = respuestaBaseCampana;
	}

	public String getRespuestaRcc() {
		return respuestaRcc;
	}

	public void setRespuestaRcc(String respuestaRcc) {
		this.respuestaRcc = respuestaRcc;
	}

	public String getRespuestaBuro() {
		return respuestaBuro;
	}

	public void setRespuestaBuro(String respuestaBuro) {
		this.respuestaBuro = respuestaBuro;
	}	
	
}
