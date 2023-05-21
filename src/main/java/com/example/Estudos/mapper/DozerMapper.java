package com.example.Estudos.mapper;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;

 // import com.github.dozermapper.core.DozerBeanMapperBuilder;
//import com.github.dozermapper.core.Mapper;

public class DozerMapper {

	private static ModelMapper mapper = new ModelMapper();
	
	
	public static <O, D> D parseObject(O origin, Class<D> destino) {	
		return mapper.map(origin, destino);
	}
	
	public static <O, D> List<D> parseListObject(List<O> origin, Class<D> destino) {
		List<D> destinoObejects = new ArrayList<>();
		for(O o: origin) {
			destinoObejects.add(mapper.map(o, destino));
		}
		
		return destinoObejects;
	}
 }
