package com.formacionbdi.springboto.app.item.model.service;

import java.util.List;

import com.formacionbdi.springboto.app.item.model.Item;
//import com.formacionbdi.springboto.app.item.model.Producto;
import com.formacionbdi.springboto.app.commons.models.entity.Producto;

public interface ItemService {

	public List<Item> findAll();
	public Item findById(Long id, Integer cantidad);
	
	public Producto save(Producto producto);
	
	public Producto update(Producto producto, Long id);
	
	public void delete(Long id);
}
