package com.example.Estudos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Estudos.dto.PessoaDTO;
import com.example.Estudos.service.PessoaService;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {
	
	@Autowired
	PessoaService pessoaService;
	
	
	@GetMapping(value ="/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public PessoaDTO findById(@PathVariable(value = "id") Long id){
		return pessoaService.findById(id);
	}
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<PessoaDTO> findAll(){
		return pessoaService.findAll();
	}
	
	@PostMapping(value ="/", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public PessoaDTO create(@RequestBody PessoaDTO pessoa){
		return pessoaService.createPessoa(pessoa);
	}
	@PutMapping(value ="/", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public PessoaDTO update(@RequestBody PessoaDTO pessoa){
		return pessoaService.updatePessoa(pessoa);
	}
	
	@DeleteMapping(value ="/{id}")
	public void delete(@PathVariable(value = "id") Long id){
		pessoaService.delete(id);
	}
}
