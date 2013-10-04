package com.team.scorp.dao;

import com.team.scorp.bean.Proyecto;
import com.team.JDO.*;

import javax.jdo.PersistenceManager;

import com.team.scorp.bean.Proyecto;

import java.io.IOException;
import java.io.Serializable;
import java.util.*;

import com.google.appengine.api.users.*;

import javax.jdo.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

public class ProyectoDao extends Action implements Serializable {
	@SuppressWarnings("unchecked")
	public void run()throws ServletException, IOException{
		try {
			//prueba de github
			Proyecto proyecto=new Proyecto();
			proyecto.setNombre(request.getParameter("nombre"));
			jdo= JDO.getInstance(Proyecto.class);
			jdo.insert(proyecto);
		}catch (Exception ex) {
			throw new ServletException(ex.getMessage());
		}
		RequestDispatcher rd=application.getRequestDispatcher("/index.jsp?pagina=gd");
		if(rd==null){
			throw new ServletException("pagina no encontrada");
		}
		rd.forward(request,response);
	}
}