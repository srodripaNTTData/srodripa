package com.example.Bootcampdia2.Mandos;

import lombok.Builder;

@Builder
public class Unidad {
	
	protected Unidad mando;
	
	protected String nombre;
	
	public void establecerMando(Unidad mando) {
		this.mando=mando;
	}
	
	public void ejecutaOrden(String orden) {
		if (orden.equals(orden)) {
			ejecutaOrden(orden);
		}
	}
}
