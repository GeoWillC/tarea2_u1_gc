package com.example.demo.tradicional;

import java.time.LocalDateTime;

public class RegistroOperaciones {
	private LocalDateTime fechaIngreso;
	private LocalDateTime fechaCaducidad;
	private Producto producto;
	private Empleado empleado;

	public void agregarProducto(String nombreEmpleado, String cedula, String cargo, LocalDateTime fechaCaducidad,
			String tipo, String nombreProducto, int stock, String id, double precio) {
		this.fechaIngreso = LocalDateTime.now();
		this.fechaCaducidad = fechaCaducidad;

		Empleado empleado = new Empleado();
		empleado.setCargo(cargo);
		empleado.setCedula(cedula);
		empleado.setNombre(nombreEmpleado);
		this.empleado = empleado;
		// No perecible (NP) / Perecible (P)
		if (tipo.equals("NP")) {
			ProductoNoPerecible productoNP = new ProductoNoPerecible();
			productoNP.setNombre(nombreProducto);
			productoNP.setStock(stock);
			productoNP.setId(id);
			productoNP.setPrecioUnidad(precio);
			productoNP.setEstado("NP");
			productoNP.setTipoProducto("Enlatado");
			this.producto = productoNP;
		} else {
			ProductoPerecible productoP = new ProductoPerecible();
			productoP.setNombre(nombreProducto);
			productoP.setStock(stock);
			productoP.setId(id);
			productoP.setPrecioUnidad(precio);
			productoP.setEstado("P");
			productoP.setCaducidad(fechaCaducidad);
			this.producto = productoP;
		}
		this.agregadoInventario(this);

	}

	private void agregadoInventario(RegistroOperaciones registro) {
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

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

}
