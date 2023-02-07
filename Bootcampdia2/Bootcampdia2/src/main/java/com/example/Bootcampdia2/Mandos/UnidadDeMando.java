package com.example.Bootcampdia2.Mandos;

import java.util.List;

import lombok.Builder;

@Builder
public class UnidadDeMando {

	private List<Unidad> ejercito;
	
	public void añadirPersona(Unidad unidad) {
		this.ejercito.add(unidad);
	}
	
	public void ejecutarOrden(String orden) {
		this.ejercito.get(0).ejecutaOrden(orden);
	}
	
}
