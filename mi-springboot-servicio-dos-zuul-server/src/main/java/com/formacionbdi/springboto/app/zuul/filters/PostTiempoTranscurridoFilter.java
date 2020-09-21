package com.formacionbdi.springboto.app.zuul.filters;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class PostTiempoTranscurridoFilter extends ZuulFilter {
	
	/*
	 * Filtro que calcula el tiempo de inicio antes que se resuelva la ruta
	 */

	/*
	 * Tres tipos de filter pre - post - route
	 * 
	 */

	private static Logger log = LoggerFactory.getLogger(PostTiempoTranscurridoFilter.class);
	
	@Override
	public boolean shouldFilter() {
		// validar si se ejectuta o no
		return true; // siempre lo ejecuta
	}

	@Override
	public Object run() throws ZuulException {
		// logica del filtro
			
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		log.info("Entrando a post filter");
		
		Long tiempoInicio = (Long)request.getAttribute("tiempoInicio");
		Long tiempoFinal = System.currentTimeMillis();
		Long tiempoTranscurrido = tiempoFinal - tiempoInicio;
		
		log.info(String.format("Tiempo transcurrido en segundos %s", tiempoTranscurrido.doubleValue()/1000.00));
		log.info(String.format("Tiempo transcurrido en milisegundos $s", tiempoTranscurrido/1000));
		
		return true;
	}

	@Override
	public String filterType() {
		return "post"; // Tipo post
						// microservicio
	}

	@Override
	public int filterOrder() {
		return 1;
	}

}
