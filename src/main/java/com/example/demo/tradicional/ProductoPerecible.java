package com.example.demo.tradicional;

import java.time.LocalDateTime;

public class ProductoPerecible extends Producto{
	private LocalDateTime caducidad;

	public LocalDateTime getCaducidad() {
		return caducidad;
	}

	public void setCaducidad(LocalDateTime caducidad) {
		this.caducidad = caducidad;
	}
	
	
}
