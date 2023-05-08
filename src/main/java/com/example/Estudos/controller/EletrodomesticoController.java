package com.example.Estudos.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Estudos.bean.EletrodomesticoBean;

@RestController
public class EletrodomesticoController {

	private static final AtomicLong id = new AtomicLong();
	List<EletrodomesticoBean> list = new ArrayList<>();
	
	@RequestMapping("/eletrodomestico")
	public EletrodomesticoBean eletrodomestico (@RequestParam(value= "cod", defaultValue = "0") String cod) {
		Random gerador = new Random();
		if(cod.equals("0")) {
			return EletrodomesticoBean.novaInstancia(gerador.nextInt(10), id.incrementAndGet());
		}else {
			return EletrodomesticoBean.novaInstancia(Integer.valueOf(cod), id.incrementAndGet());
		}
	}
	
}
