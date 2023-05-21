package com.example.Estudos.mapper;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.Estudos.bean.PessoaBean;
import com.example.Estudos.dto.PessoaDTO;
import com.example.Estudos.mapper.mocks.MockPessoa;

public class DozerConverterTeste {
	MockPessoa inputObject;

    @BeforeEach
    public void setUp() {
        inputObject = new MockPessoa();
    }

    @Test
    public void parseEntityToVOTest() {
        PessoaDTO output = DozerMapper.parseObject(inputObject.mockEntity(), PessoaDTO.class);
        assertEquals(Long.valueOf(0L), output.getId());
        assertEquals("Primeiro nome teste 0", output.getPrimeiroNome());
        assertEquals("Ultimo nome teste 0", output.getUltimoNome());
        assertEquals("Email 0", output.getEmail());
        assertEquals("Male", output.getGenero());
    }

    @Test
    public void parseEntityListToVOListTest() {
        List<PessoaDTO> outputList = DozerMapper.parseListObject(inputObject.mockEntityList(), PessoaDTO.class);
        PessoaDTO outputZero = outputList.get(0);
        
        assertEquals(Long.valueOf(0L), outputZero.getId());
        assertEquals("Primeiro nome teste 0", outputZero.getPrimeiroNome());
        assertEquals("Ultimo nome teste 0", outputZero.getUltimoNome());
        assertEquals("Email 0", outputZero.getEmail());
        assertEquals("Male", outputZero.getGenero());
        
        PessoaDTO outputSeven = outputList.get(7);
        
        assertEquals(Long.valueOf(7L), outputSeven.getId());
        assertEquals("Primeiro nome teste 7", outputSeven.getPrimeiroNome());
        assertEquals("Ultimo nome teste 7", outputSeven.getUltimoNome());
        assertEquals("Email 7", outputSeven.getEmail());
        assertEquals("Female", outputSeven.getGenero());
        
        PessoaDTO outputTwelve = outputList.get(12);
        
        assertEquals(Long.valueOf(12L), outputTwelve.getId());
        assertEquals("Primeiro nome teste 12", outputTwelve.getPrimeiroNome());
        assertEquals("Ultimo nome teste 12", outputTwelve.getUltimoNome());
        assertEquals("Email 12", outputTwelve.getEmail());
        assertEquals("Male", outputTwelve.getGenero());
    }

    @Test
    public void parseVOToEntityTest() {
        PessoaBean output = DozerMapper.parseObject(inputObject.mockVO(), PessoaBean.class);
        assertEquals(Long.valueOf(0L), output.getId());
        assertEquals("Primeiro nome teste 0", output.getPrimeiroNome());
        assertEquals("Ultimo nome teste 0", output.getUltimoNome());
        assertEquals("Email 0", output.getEmail());
        assertEquals("Male", output.getGenero());
    }

    @Test
    public void parserVOListToEntityListTest() {
        List<PessoaBean> outputList = DozerMapper.parseListObject(inputObject.mockVOList(), PessoaBean.class);
        PessoaBean outputZero = outputList.get(0);
     
        assertEquals(Long.valueOf(0L), outputZero.getId());
        assertEquals("Primeiro nome teste 0", outputZero.getPrimeiroNome());
        assertEquals("Ultimo nome teste 0", outputZero.getUltimoNome());
        assertEquals("Email 0", outputZero.getEmail());
        assertEquals("Male", outputZero.getGenero());
        
        PessoaBean outputSeven = outputList.get(7);
        
        assertEquals(Long.valueOf(7L), outputSeven.getId());
        assertEquals("Primeiro nome teste 7", outputSeven.getPrimeiroNome());
        assertEquals("Ultimo nome teste 7", outputSeven.getUltimoNome());
        assertEquals("Email 7", outputSeven.getEmail());
        assertEquals("Female", outputSeven.getGenero());
        
        PessoaBean outputTwelve = outputList.get(12);
        
        assertEquals(Long.valueOf(12L), outputTwelve.getId());
        assertEquals("Primeiro nome teste 12", outputTwelve.getPrimeiroNome());
        assertEquals("Ultimo nome teste 12", outputTwelve.getUltimoNome());
        assertEquals("Email 12", outputTwelve.getEmail());
        assertEquals("Male", outputTwelve.getGenero());
    }
}
