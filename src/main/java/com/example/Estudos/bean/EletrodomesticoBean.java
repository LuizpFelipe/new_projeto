package com.example.Estudos.bean;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class EletrodomesticoBean {
	
	private Long id;
	private Boolean antena;
	private String nome;
	private String marca;
	private Boolean rodas;
	private String consumoEnergia;
	private Boolean garantia;
	
	
	public static EletrodomesticoBean novaInstancia(Integer cod, Long id) {
		switch (cod) {
		case 1: {
			return new EletrodomesticoBean(id, false, "Geladeira", "Consul", true, "A", true);			
		}
		case 2: {
			return new EletrodomesticoBean(id, true, "Televisão", "Acer", false, "A", true);			
		}
		case 3: {
			return new EletrodomesticoBean(id, false, "Computador", "Acer", false, "A", true);			
		}
		case 4: {
			return new EletrodomesticoBean(id, false, "Notebook", "Acer", false, "A", true);			
		}
		case 5: {
			return new EletrodomesticoBean(id, false, "Celuar", "Xaiomi", false, "A", true);			
		}
		case 6: {
			return new EletrodomesticoBean(id, false, "Fogão", "Atlas", true, "A", true);			
		}
		case 7: {
			return new EletrodomesticoBean(id, false, "Ps4", "Sony", false, "A", true);			
		}
		case 8: {
			return new EletrodomesticoBean(id, false, "Maquina de Lavar", "Blatemp", true, "A", false);			
		}
		case 9: {
			return new EletrodomesticoBean(id, false, "Microondas", "Consul", false, "A", true);			
		}
		case 10: {
			return new EletrodomesticoBean(id, false, "Ventilador", "Ventani", false, "A", true);			
		}
		case 0: {
			return new EletrodomesticoBean(id, false, "padrão", "padrao", false, "padrao", false);			
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + cod);
		}
	}
	
	public EletrodomesticoBean(Long id, Boolean antena, String nome, String marca, Boolean rodas, String consumoEnergia, Boolean garantia) {
		this.id = id;
		this.antena = antena;
		this.nome = nome;
		this.marca = marca;
		this.rodas = rodas;
		this.consumoEnergia = consumoEnergia;
		this.garantia = garantia;
	}
}
