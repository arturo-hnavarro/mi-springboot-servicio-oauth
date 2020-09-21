package com.formacionbdi.springboto.app.usuarios;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

/*import com.formacionbdi.springboto.app.usuarios.models.entity.Role;
import com.formacionbdi.springboto.app.usuarios.models.entity.Usuario;*/


import com.formacionbdi.springboto.app.usuarios.commns.models.entity.Role;
import com.formacionbdi.springboto.app.usuarios.commns.models.entity.Usuario;


@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer{

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.exposeIdsFor(Usuario.class, Role.class);
	}
	

}
