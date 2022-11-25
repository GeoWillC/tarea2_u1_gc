package com.example.demo.spring;

public class EmpleadoSB {
	private String nombre;
	private String cedula;
	private String cargo;
	
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", cedula=" + cedula + ", cargo=" + cargo + "]";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
}
