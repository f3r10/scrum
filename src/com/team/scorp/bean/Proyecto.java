package com.team.scorp.bean;



import java.io.Serializable;
import java.util.Date;

import javax.jdo.annotations.*;
import javax.persistence.Id;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.users.User;

@SuppressWarnings("serial")
@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Proyecto implements Serializable, Comparable<Proyecto> {
	private static final int ENTITIES_PER_PAGE = 3;
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	@Persistent(valueStrategy = IdGeneratorStrategy.SEQUENCE)
	private Long id;
	@Persistent
	private String nombre;

	// Constructor de la Clase
	public Proyecto() {
		super();
	}

	// Metodos get y set

	public Long getId() {
		return id;
	}

	public Key getKey() {
		return key;
	}

	public String getNombre() {
		return nombre;
	}

	public void setKey(Key key) {
		this.key = key;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String toString(){ 
		return(
		"DATOS:::DEPARTAMENTO:::...\n"+
		"ID             : "+id+"\n"+
		"NOMBRE         : "+nombre+"\n"+
		"");
	}
	public int compareTo(Proyecto proyecto){
		return nombre.compareTo(proyecto.getNombre());
	}

}