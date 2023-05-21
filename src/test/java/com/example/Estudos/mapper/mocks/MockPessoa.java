package com.example.Estudos.mapper.mocks;

import java.util.ArrayList;
import java.util.List;

import com.example.Estudos.bean.PessoaBean;
import com.example.Estudos.dto.PessoaDTO;


public class MockPessoa {
	
	public PessoaBean mockEntity() {
        return mockEntity(0);
    }
    
    public PessoaDTO mockVO() {
        return mockVO(0);
    }
    
    public List<PessoaBean> mockEntityList() {
        List<PessoaBean> PessoaBeans = new ArrayList<PessoaBean>();
        for (int i = 0; i < 14; i++) {
            PessoaBeans.add(mockEntity(i));
        }
        return PessoaBeans;
    }

    public List<PessoaDTO> mockVOList() {
        List<PessoaDTO> PessoaBeans = new ArrayList<>();
        for (int i = 0; i < 14; i++) {
            PessoaBeans.add(mockVO(i));
        }
        return PessoaBeans;
    }
    
    public PessoaBean mockEntity(Integer numero) {
        PessoaBean PessoaBean = new PessoaBean();
        PessoaBean.setPrimeiroNome("Primeiro nome teste " + numero);
        PessoaBean.setUltimoNome("Ultimo nome teste " + numero);
        PessoaBean.setGenero(((numero % 2)==0) ? "Male" : "Female");
        PessoaBean.setId(numero.longValue());
        PessoaBean.setEmail("Email " + numero);
        return PessoaBean;
    }

    public PessoaDTO mockVO(Integer numero) {
        PessoaDTO PessoaBean = new PessoaDTO();
        PessoaBean.setPrimeiroNome("Primeiro nome teste " + numero);
        PessoaBean.setUltimoNome("Ultimo nome teste " + numero);
        PessoaBean.setGenero(((numero % 2)==0) ? "Male" : "Female");
        PessoaBean.setId(numero.longValue());
        PessoaBean.setEmail("Email " + numero);
        return PessoaBean;
    }
}
