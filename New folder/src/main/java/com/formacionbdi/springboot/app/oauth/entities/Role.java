package com.formacionbdi.springboot.app.oauth.entities;



//@Entity
//@Table(name="roles")
public class Role {//implements Serializable /*recomendado por spring, util para guardar la sesion*/{

	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//@Column(unique = true, length = 30)
	private String nombre;
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//private static final long serialVersionUID = -3283509767425885722L;

}
