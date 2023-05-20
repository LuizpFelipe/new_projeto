package com.example.Estudos.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.Estudos.bean.PessoaBean;
import com.example.Estudos.repository.PessoaRepository;
import com.example.exception.ResouceNotFoundException;

@Service
public class PessoaService {
	
	private final AtomicLong conter = new AtomicLong();	
	private Logger logger = Logger.getLogger(PessoaService.class.getName());
	
	@Autowired
	PessoaRepository pessoaRepository;
	
	public PessoaBean findById(Long id) {
		logger.info("Procurando a Pessoa");
		return pessoaRepository.findById(id).orElseThrow(()-> new ResouceNotFoundException("Pessoa não encontrada"));
	}
	
	public List<PessoaBean> findAll() {		
		return pessoaRepository.findAll();
	}
	
	public PessoaBean createPessoa(PessoaBean pessoa) {
		logger.info("Criando PessoaBean");
		return pessoaRepository.save(pessoa);
	}
	
	public PessoaBean updatePessoa(PessoaBean pessoa) {
		var entity = pessoaRepository.findById(pessoa.getId()).orElseThrow(()-> new ResouceNotFoundException("Pessoa não encontrada"));
		entity.setUltimoNome(pessoa.getPrimeiroNome());
		entity.setUltimoNome(pessoa.getUltimoNome());
		entity.setEmail(pessoa.getGenero());
		entity.setEmail(pessoa.getGenero());
		return pessoaRepository.save(entity);
	}
	
	public void delete(Long id) {
		var entity = pessoaRepository.findById(id).orElseThrow(()-> new ResouceNotFoundException("Pessoa não encontrada"));
		logger.info("Deletando Pessoa");
		pessoaRepository.delete(entity);
	}
}
