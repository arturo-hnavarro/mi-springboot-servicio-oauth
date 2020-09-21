package com.formacionbdi.springboot.app.productos.models.service;

import java.util.List;

import com.formacionbdi.springboto.app.commons.models.entity.Producto;

public interface IproductoService {

	public List<Producto> findAll();
	public Producto findById(Long id);			
	
	public Producto Save(Producto producto);
	
	public void deleteById(Long id);
	
}
