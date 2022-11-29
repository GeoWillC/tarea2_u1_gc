package com.example.demo.bodega.modelo;

import java.math.BigDecimal;

public class Producto {
	public String nombre;
	public Integer stock;
	public String id;
	public BigDecimal precioUnidad;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public BigDecimal getPrecioUnidad() {
		return precioUnidad;
	}
	public void setPrecioUnidad(BigDecimal precioUnidad) {
		this.precioUnidad = precioUnidad;
	}

	}
