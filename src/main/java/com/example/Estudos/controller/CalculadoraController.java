package com.example.Estudos.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.exception.UnsuportedMathOperationException;

@RestController
public class CalculadoraController {

	
	
	@RequestMapping(value = "/sum/{numeroUm}/{numeroDois}", method = RequestMethod.GET)
	public Double Sum(@PathVariable(value = "numeroUm") String numeroUm,
			@PathVariable(value = "numeroDois") String numeroDois) throws Exception {
		if (!isNumeric(numeroUm) || !isNumeric(numeroDois)) {
			throw new UnsuportedMathOperationException("Digite um numero valido");
		}
		return converterDouble(numeroUm) + converterDouble(numeroDois);	
	}

	private Double converterDouble(String strNumero) {		
		String numeroFormatado = strNumero.replaceAll(",", ".");
		if (isNumeric(numeroFormatado) && strNumero != null) {
			return Double.valueOf(numeroFormatado);
		}
		return 0D;
	}

	private boolean isNumeric(String numero) {
		if (numero == null) {
	        return false;
		} try {
	        Double.parseDouble(numero);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}
}
