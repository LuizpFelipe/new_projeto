package com.example.Estudos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Estudos.bean.PessoaBean;

@Repository
public interface PessoaRepository extends JpaRepository<PessoaBean, Long> {}
