package com.example.demo.spring;

public class ProductoSB {
	public String nombre;
	public int stock;
	public String id;
	public double precioUnidad;

	public String tipoMantenimiento() {
		String mantenimiento="No requiere mantenimiento";
		return  mantenimiento;
	}
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", stock=" + stock + ", id=" + id + ", precioUnidad=" + precioUnidad + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getPrecioUnidad() {
		return precioUnidad;
	}

	public void setPrecioUnidad(double precioUnidad) {
		this.precioUnidad = precioUnidad;
	}

}
