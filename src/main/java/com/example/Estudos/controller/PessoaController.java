package com.example.Estudos.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Estudos.bean.PessoaBean;

@RestController
public class PessoaController {
	
	private static final String template = "Hello, %s!";
	private static final AtomicLong id = new AtomicLong();
	
	@RequestMapping("/pessoa")
	public PessoaBean pessoa (@RequestParam(value = "cod", defaultValue = "0")String cod,
			@RequestParam(value = "nome", defaultValue = "Pessoa")String nome,
			@RequestParam(value = "descricao", defaultValue = "Descrição")String descricao) {
		return PessoaBean.novaInstancia(Integer.valueOf(cod),id.incrementAndGet(), String.format(template, nome), descricao);		
	}

}
