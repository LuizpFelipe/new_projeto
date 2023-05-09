package com.example.exception;

import java.io.Serializable;
import java.util.Date;

public class ExceptionResponse implements Serializable {
	private static final long serialVersionUID = 1L;

	private Date timeStamp;
	private String mensagem;
	private String detalhes;

	public ExceptionResponse(Date timeStamp, String mensagem, String detalhes) {
		super();
		this.timeStamp = timeStamp;
		this.mensagem = mensagem;
		this.detalhes = detalhes;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getDetalhes() {
		return detalhes;
	}

	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}

}
