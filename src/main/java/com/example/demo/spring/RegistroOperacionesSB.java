package com.example.demo.spring;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class RegistroOperacionesSB {
	private LocalDateTime fechaIngreso;
	private LocalDateTime fechaCaducidad;
	private ProductoSB producto;
	private EmpleadoSB empleado;

	public void agregarProducto(LocalDateTime fechaIngreso,EmpleadoSB emp, ProductoSB prod) {
		this.fechaIngreso = LocalDateTime.now();

		String mantenimiento=prod.tipoMantenimiento();
		System.out.println("El mantenimiento requerido es: "+mantenimiento);
		
		this.empleado = emp;
		this.producto=prod;
		// No perecible (NP) / Perecible (P)
		this.agregadoInventario(this);

	}

	private void agregadoInventario(RegistroOperacionesSB registro) {
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

	public ProductoSB getProducto() {
		return producto;
	}

	public void setProducto(ProductoSB producto) {
		this.producto = producto;
	}

	public EmpleadoSB getEmpleado() {
		return empleado;
	}

	public void setEmpleado(EmpleadoSB empleado) {
		this.empleado = empleado;
	}

}
