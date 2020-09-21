package com.formacionbdi.springboot.app.productos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient //no es necesario(con solo la info del pom.xml basta) pero es recomendable
@SpringBootApplication
@EntityScan({"com.formacionbdi.springboto.app.commons.models.entity"}) //establece el lugar donde debe buscar las clases entity. Esto porque se agrego como un libreria externa las clases entity
public class MiSpringbootServicioProductosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiSpringbootServicioProductosApplication.class, args);
	}

}
