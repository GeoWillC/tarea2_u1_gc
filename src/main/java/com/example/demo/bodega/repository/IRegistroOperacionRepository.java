package com.example.demo.bodega.repository;

import com.example.demo.tradicional.RegistroOperaciones;

public interface IRegistroOperacionRepository {

	// CRUD
	public RegistroOperaciones buscar(Integer id); //Primary key
	//
	public void actualizar(RegistroOperaciones registro);
	public void insertar(RegistroOperaciones registro);
	public void borrar(Integer id);
	
}
