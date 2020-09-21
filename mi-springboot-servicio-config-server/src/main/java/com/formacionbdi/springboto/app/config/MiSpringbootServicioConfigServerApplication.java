package com.formacionbdi.springboto.app.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class MiSpringbootServicioConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiSpringbootServicioConfigServerApplication.class, args);
	}

}


/*
Sección 4:Spring Cloud Config Server: centralizando la configuración

centra la configuracion de los microservicios, diferentes ambientes.
La configuracion se puede guardar en git local o remoto o por medio de archivos locales.

El proyecto se habilita con @EnableConfigServer en la clase principal

Funcionamiento:

1- Microservicio se conecta al servidor de configuracion antes de registrarse en eureka
2- los atributos los obtiene de git (puertos, ambientes, bd)
3- luego se conecta a Eureka
4- Agregar a los clientes la dependencia Spring cloud config client
5- en los clientes copiar el nombre del aplication.properties y renombrarlo como bootstrap.properties. A este agregarle el uri del servidor de configuracion 
*/