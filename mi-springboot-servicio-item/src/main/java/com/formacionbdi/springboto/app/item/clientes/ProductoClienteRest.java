package com.formacionbdi.springboto.app.item.clientes;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.repository.query.Param;
//import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

//import com.formacionbdi.springboto.app.item.model.Producto;
import com.formacionbdi.springboto.app.commons.models.entity.Producto;
//import com.formacionbdi.springboto.app.usuarios.models.entity.Usuario;


@FeignClient(name = "servicio-productos")
public interface ProductoClienteRest {
	
	@GetMapping("/listar") //endpoint al que se conecta en el api
	public List<Producto> listar();
	
	@GetMapping("/ver/{id}") //endpoint al que se conecta en el api
	public Producto detalle(@Param("id") Long id);
	//public Producto detalle(@PathVariable Long id);
	
	@PostMapping("/crear")
	public Producto crear(@RequestBody Producto producto);
	
	@PutMapping("/editar/{id}")
	public Producto update(@RequestBody Producto producto, @Param("id") Long id);
	//public Producto update(@RequestBody Producto producto, @PathVariable Long id);

	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@Param("id")  Long id);
	//public void eliminar(@PathVariable Long id);
	
	
	
}
