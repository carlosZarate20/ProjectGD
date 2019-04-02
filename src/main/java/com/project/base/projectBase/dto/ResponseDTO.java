package com.project.base.projectBase.dto;


public class ResponseDTO <A> {
	private String respuestaReniec;
	private String respuestaBaseCampana;
	private String respuestaRccAndRuc;
	private String respuestaRcc;
	private String respuestaRuc;
	private String respuestaGeneral;
	private Long isValid;
	
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

	public String getRespuestaRccAndRuc() {
		return respuestaRccAndRuc;
	}

	public void setRespuestaRccAndRuc(String respuestaRccAndRuc) {
		this.respuestaRccAndRuc = respuestaRccAndRuc;
	}

	public String getRespuestaGeneral() {
		return respuestaGeneral;
	}

	public void setRespuestaGeneral(String respuestaGeneral) {
		this.respuestaGeneral = respuestaGeneral;
	}

	public Long getIsValid() {
		return isValid;
	}

	public void setIsValid(Long isValid) {
		this.isValid = isValid;
	}

	public String getRespuestaRcc() {
		return respuestaRcc;
	}

	public void setRespuestaRcc(String respuestaRcc) {
		this.respuestaRcc = respuestaRcc;
	}

	public String getRespuestaRuc() {
		return respuestaRuc;
	}

	public void setRespuestaRuc(String respuestaRuc) {
		this.respuestaRuc = respuestaRuc;
	}
	
}
