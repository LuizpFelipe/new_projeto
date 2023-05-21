package com.example.Estudos.dto;

import java.io.Serializable;

public class PessoaDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String primeiroNome;
	private String email;
	private String ultimoNome;
	private String genero;
	
	public PessoaDTO() {
		
	}
	
	public PessoaDTO(Long id, String primeiroNome, String ultimoNome, String email, String genero) {
		this.id = id;
		this.primeiroNome = primeiroNome;
		this.ultimoNome = ultimoNome;
		this.email = email;
		this.genero = genero;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
