package com.team.scorp.bean;

import java.util.Date;

import javax.jdo.annotations.*;
import javax.persistence.Id;

import com.google.appengine.api.users.User;
 
//Especifica que la clase es Persistente
@PersistenceCapable(identityType=IdentityType.APPLICATION)
public class Proyecto {
	private static final int ENTITIES_PER_PAGE = 3;
	
	
 //Va a ser la clave primaria de la clase Empleado
@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key key;
  
 @Persistent
 private String nombres;
 
 
  
 //Constructor de la Clase
 public Proyecto(String nombres)
 {
  
  this.nombres=nombres;
  
 }
  
 //Metodos get y set
 
 
 public String getNombres() {
  return nombres;
 }
 public void setNombres(String nombres) {
  this.nombres = nombres;
 }
 
}