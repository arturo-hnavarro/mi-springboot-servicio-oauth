package com.formacionbdi.springboto.app.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableCircuitBreaker
@EnableEurekaClient //no es necesario(con solo la info del pom.xml basta) pero es recomendable
//@RibbonClient(name= "servicio-productos") //microservicio al cual se conecta para usar balanceo de cargas
@EnableFeignClients
@SpringBootApplication
@EntityScan({"com.formacionbdi.springboto.app.commons.models.entity"})
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class}) // se agrega para eliminar la dependencia de spring boot por agregar una bd a los proyectos
public class MiSpringbootServicioItemApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiSpringbootServicioItemApplication.class, args);
	}

}
