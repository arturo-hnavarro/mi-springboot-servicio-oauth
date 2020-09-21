package com.formacionbdi.springboto.app.commons;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class}) // se agrega para eliminar la dependencia de spring boot por agregar una bd a los proyectos
public class MiSpringbootServicioCommonsApplication {

	/*para generar .jar en consola desde ubicacion del proyecto ejecutar \mvnw.cmd install
	 *esto  agregar el proyecto al repositorio local de maven para incorporarlo en otros proyectos
	 * */
	 
	
	
	/*eliminar el main pues funciona como libreria
	 * public static void main(String[] args) {
		SpringApplication.run(MiSpringbootServicioCommonsApplication.class, args);
	}
	*/

}
