package com.formacionbdi.springboto.app.usuarios.models.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.formacionbdi.springboto.app.usuarios.models.entity.Usuario;
//import com.formacionbdi.springboto.app.usuarios.commns.models.entity.Usuario;



/*
 * @RepositoryRestResource(path="usuarios") permite exponer los metodos sin necesidad de agregar controladores, muy rapido. Implementa el CRUD por debajo
 * para acceder a los metodos creados: (por ejemplo para el metodo public Usuario findByUsername(String username); )
 * localhost:8090/api/usuarios/usuarios/search/findByUsername?username=admin
 * 
 * puede agregar un nombre personalizado al url:
 * 	
 *	@RestResource(path="buscar-username")
 *	public Usuario findByUsername(@Param("username") String username);
 */


@RepositoryRestResource(path="usuarios")
public interface UsuarioDao extends PagingAndSortingRepository<Usuario, Long>{
	
	/*
	 * usando spring data jpa
	 * by funciona como where y agrega los campos que se anexan
	 * Ej: public Usuario findByUsernameAndEmail(String username, String email);
	 * */
	
	//usando data query jpa
	@RestResource(path="buscar-username")
	public Usuario findByUsername(@Param("username") String username);
	
	
	/*
	 * personalizado
	 * */
	@Query("select u from Usuario u where u.username=?1")
	public Usuario obtenerPorUsername(String username);  

}
