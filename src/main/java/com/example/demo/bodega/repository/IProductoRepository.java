package com.example.demo.bodega.repository;

import com.example.demo.bodega.modelo.Producto;

public interface IProductoRepository {

	// CRUD
	public void insertar(Producto producto);	//C

	public Producto buscarPorId(String id); //R

	public Producto buscar(Integer id); // Primary key

	public void actualizar(Producto producto);	//U
	
	public void borrar(Integer id);	//D

}
