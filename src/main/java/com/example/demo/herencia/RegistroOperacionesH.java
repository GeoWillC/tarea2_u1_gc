package com.example.demo.herencia;

import java.time.LocalDateTime;

public class RegistroOperacionesH {
	private LocalDateTime fechaIngreso;
	private LocalDateTime fechaCaducidad;
	private ProductoH producto;
	private Empleado empleado;

	public void agregarProducto(LocalDateTime fechaIngreso,Empleado emp, ProductoH prod) {
		this.fechaIngreso = LocalDateTime.now();

		String mantenimiento=prod.tipoMantenimiento();
		System.out.println("El mantenimiento requerido es: "+mantenimiento);
		
		this.empleado = emp;
		this.producto=prod;
		// No perecible (NP) / Perecible (P)
		this.agregadoInventario(this);

	}

	private void agregadoInventario(RegistroOperacionesH registro) {
		System.out.println("El elemento ha sido agregado al inventario");
		System.out.println(registro);
	}

	
	@Override
	public String toString() {
		return "Registro de Operaciones [fechaIngreso=" + fechaIngreso + ", fechaCaducidad=" + fechaCaducidad
				+ "\nProducto=" + producto + "\nEmpleado=" + empleado + "]";
	}

	public LocalDateTime getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDateTime fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public LocalDateTime getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(LocalDateTime fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public ProductoH getProducto() {
		return producto;
	}

	public void setProducto(ProductoH producto) {
		this.producto = producto;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

}
