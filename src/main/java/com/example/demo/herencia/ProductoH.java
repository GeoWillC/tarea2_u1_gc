package com.example.demo.herencia;

public class ProductoH {
	private String nombre;
	private int stock;
	private String id;
	private double precioUnidad;

	public String tipoMantenimiento() {
		String mantenimiento="No requiere mantenimiento";
		return  mantenimiento;
	}
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", stock=" + stock + ", id=" + id + ", precioUnidad=" + precioUnidad + "]";
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected int getStock() {
		return stock;
	}

	protected void setStock(int stock) {
		this.stock = stock;
	}

	protected String getId() {
		return id;
	}

	protected void setId(String id) {
		this.id = id;
	}

	protected double getPrecioUnidad() {
		return precioUnidad;
	}

	protected void setPrecioUnidad(double precioUnidad) {
		this.precioUnidad = precioUnidad;
	}

}
