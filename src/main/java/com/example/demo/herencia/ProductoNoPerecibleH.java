package com.example.demo.herencia;

public class ProductoNoPerecibleH extends ProductoH {
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
