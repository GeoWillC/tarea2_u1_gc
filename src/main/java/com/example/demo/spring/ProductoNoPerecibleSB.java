package com.example.demo.spring;

import org.springframework.stereotype.Component;

@Component
public class ProductoNoPerecibleSB extends ProductoSB {
	private String tipoProducto;
	
	public String tipoMantenimiento() {
		String mantenimiento = "No requiere refrigeracion y puede almacenarse por mucho tiempo";
		return mantenimiento;
	}

	public String getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}
	
	
}
