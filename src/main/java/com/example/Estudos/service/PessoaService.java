package com.example.Estudos.service;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Estudos.bean.PessoaBean;
import com.example.Estudos.dto.PessoaDTO;
import com.example.Estudos.mapper.DozerMapper;
import com.example.Estudos.repository.PessoaRepository;
import com.example.exception.ResouceNotFoundException;

@Service
public class PessoaService {
	
	private final AtomicLong conter = new AtomicLong();	
	private Logger logger = Logger.getLogger(PessoaService.class.getName());
	
	@Autowired
	PessoaRepository pessoaRepository;
	
	public PessoaDTO findById(Long id) {
		logger.info("Procurando a Pessoa");
		var entity =  pessoaRepository.findById(id).orElseThrow(()-> new ResouceNotFoundException("Pessoa não encontrada"));
		return DozerMapper.parseObject(entity, PessoaDTO.class);
	}
	
	public List<PessoaDTO> findAll() {		
		return DozerMapper.parseListObject(pessoaRepository.findAll(), PessoaDTO.class);
	}
	
	public PessoaDTO createPessoa(PessoaDTO pessoa) {
		logger.info("Criando PessoaDTO");
		var entity = DozerMapper.parseObject(pessoa, PessoaBean.class);
		var vo = DozerMapper.parseObject(pessoaRepository.save(entity), PessoaDTO.class);
		return vo;
	}
	
	public PessoaDTO updatePessoa(PessoaDTO pessoa) {
		var entity = pessoaRepository.findById(pessoa.getId()).orElseThrow(()-> new ResouceNotFoundException("Pessoa não encontrada"));
		entity.setPrimeiroNome(pessoa.getPrimeiroNome());
		entity.setUltimoNome(pessoa.getUltimoNome());
		entity.setEmail(pessoa.getEmail());
		entity.setGenero(pessoa.getGenero());
		pessoaRepository.save(entity);
		return  DozerMapper.parseObject(entity, PessoaDTO.class);
	}
	
	public void delete(Long id) {
		var entity = pessoaRepository.findById(id).orElseThrow(()-> new ResouceNotFoundException("Pessoa não encontrada"));
		logger.info("Deletando Pessoa");
		pessoaRepository.delete(entity);
	}
}
