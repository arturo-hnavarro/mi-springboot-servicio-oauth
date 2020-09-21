package com.formacionbdi.springboot.app.oauth.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.formacionbdi.springboot.app.oauth.entities.Usuario;

//import com.formacionbdi.springboto.app.usuarios.commns.models.entity.Usuario;

@FeignClient(name="servicio-usuarios")//nombre del microservicio con el que se quiere comunicar
public interface UsuariosFeingClient {

	@GetMapping("/usuarios/search/buscar-username")
	public Usuario findByUserName(@RequestParam("name") String username);
	
}
