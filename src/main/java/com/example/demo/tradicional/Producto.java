package com.example.demo.tradicional;

public class Producto {
	private String nombre;
	private int stock;
	private String id;
	private String estado;
	private double precioUnidad;

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", stock=" + stock + ", id=" + id + ", estado=" + estado
				+ ", precioUnidad=" + precioUnidad + "]";
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

	protected String getEstado() {
		return estado;
	}

	protected void setEstado(String estado) {
		this.estado = estado;
	}

	protected double getPrecioUnidad() {
		return precioUnidad;
	}

	protected void setPrecioUnidad(double precioUnidad) {
		this.precioUnidad = precioUnidad;
	}

}
