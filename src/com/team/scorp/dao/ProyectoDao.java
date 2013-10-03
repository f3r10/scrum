package com.team.scorp.dao;

import javax.jdo.PersistenceManager;

import com.team.scorp.bean.Proyecto;
import java.util.*;
import com.google.appengine.api.users.*;
import javax.jdo.Query;

public class ProyectoDao {
	// Metodo para Insertar un Nuevo Registro
	public static void insertarProyecto(String nombres) {
		// LLamamos a la clase que tendra la persistencia
		
		// Nueva variable empleado
		Proyecto proyecto = new Proyecto(nombres);
		PersistenceManager pm = PMF.get().getPersistenceManager();
		// Haciendo la persistencia de datos
			
		try{
			pm.makePersistent(proyecto);	
		}
		finally{
		pm.close();
		}
	}

	@SuppressWarnings("unchecked")
	// Metodo para Listar Empleados
	public static List<Proyecto> listarProyecto() {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		Query query = pm.newQuery("select from " + Proyecto.class.getName()
				+ "");
		pm.close();
		return (List<Proyecto>) query.execute();
		
	}
}