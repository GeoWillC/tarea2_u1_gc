package com.example.demo.spring;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

@Component
public class ProductoPerecibleSB extends ProductoSB{
	private LocalDateTime caducidad;
	
	public String tipoMantenimiento() {
		String mantenimiento="Refrigeracion y despacho antes de su fecha limite";
		return mantenimiento;
	}

	public LocalDateTime getCaducidad() {
		return caducidad;
	}

	public void setCaducidad(LocalDateTime caducidad) {
		this.caducidad = caducidad;
	}
	
}
