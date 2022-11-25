package com.example.demo.herencia;

import java.time.LocalDateTime;

import com.example.demo.tradicional.ProductoNoPerecible;
import com.example.demo.tradicional.ProductoPerecible;

public class MainFramework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProductoNoPerecibleH productoNP = new ProductoNoPerecibleH();
		productoNP.setNombre("Sopa de fideos");
		productoNP.setStock(20);
		productoNP.setId("12432141");
		productoNP.setPrecioUnidad(3.12);
		productoNP.setTipoProducto("Enlatado");
		System.out.println("Este producto no requiere refrigeracion");
		
//		ProductoPerecibleH productoP = new ProductoPerecibleH();
//		productoP.setNombre("Lechuga");
//		productoP.setStock(20);
//		productoP.setId("2012112");
//		productoP.setPrecioUnidad(1.20);
//		productoP.setCaducidad(LocalDateTime.of(2022, 11,25,14,20));
//		System.out.println("Es imperativo que este producto se refrigere");
		
		Empleado empleado = new Empleado();
		empleado.setCargo("Bodeguero");
		empleado.setCedula("1751254265");
		empleado.setNombre("Juan Perez");
		
		
		RegistroOperacionesH registro=new RegistroOperacionesH();
		registro.agregarProducto(LocalDateTime.now(), empleado, productoNP);
	}

}
