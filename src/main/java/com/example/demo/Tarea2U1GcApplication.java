package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.spring.*;

@SpringBootApplication
public class Tarea2U1GcApplication implements CommandLineRunner {

	@Autowired
	private RegistroOperacionesSB registro;
	private EmpleadoSB empleado;
	
	@Autowired
	private ProductoNoPerecibleSB productonoPerecible;
	
	public static void main(String[] args) {
		SpringApplication.run(Tarea2U1GcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Spring boot Tarea 4");
		//No perecible NP
		this.productonoPerecible.setTipoProducto("NP");
		this.productonoPerecible.setId("1223123");
		this.productonoPerecible.setNombre("Arroz Sol");
		this.productonoPerecible.setPrecioUnidad(40.15);
		this.productonoPerecible.setStock(20);
		this.productonoPerecible.setTipoProducto("Grano");
	
		System.out.println(productonoPerecible);
		registro.agregarProducto(LocalDateTime.now(), empleado, productonoPerecible);
		
	}
	
}
