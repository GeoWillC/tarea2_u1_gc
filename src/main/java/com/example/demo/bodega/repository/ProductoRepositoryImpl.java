package com.example.demo.bodega.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.bodega.modelo.Producto;

public class ProductoRepositoryImpl implements IProductoRepository{

	private static List<Producto> baseProductos=new ArrayList<>();
	
	@Override
	public void insertar(Producto producto) {
		// TODO Auto-generated method stub
		baseProductos.add(producto);
	}

	@Override
	public Producto buscarPorId(String id) {
		// TODO Auto-generated method stub
		Producto producto=new Producto();
		producto.setId("A12345");
		producto.setNombre("Arroz");
		producto.setPrecioUnidad(new BigDecimal(45));
		producto.setStock(20);
		
		return producto;
	}

	@Override
	public Producto buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizar(Producto producto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
