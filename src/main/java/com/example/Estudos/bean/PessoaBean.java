package com.example.Estudos.bean;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PessoaBean {
	
	private Long id;
	private String nome;
	private String descricao;
		
	
	public static PessoaBean novaInstancia(Integer cod, long id, String nome, String descricao) {
		if(cod == 1) {
			return new PessoaBean(id,nome);
		}else {
			return new PessoaBean(id,nome, descricao);
		}
	}
	public PessoaBean(long id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public PessoaBean(long id, String nome, String descricao) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
	}

}
