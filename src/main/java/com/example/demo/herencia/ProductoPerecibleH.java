package com.example.demo.herencia;

import java.time.LocalDateTime;

public class ProductoPerecibleH extends ProductoH{
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
