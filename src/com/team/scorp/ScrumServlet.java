package com.team.scorp;

import com.team.scorp.dao.*;
import com.team.scorp.bean.*;

import java.util.*;
import java.io.IOException;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.*;
import javax.servlet.http.*;

import com.google.appengine.api.users.*;

@SuppressWarnings("serial")
public class ScrumServlet extends HttpServlet  implements Serializable {
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		if (req.getParameter("action").equals("registrar")) {
			String nombres = req.getParameter("nombres");
			System.out.println("aqui estoy");
			ProyectoDao.insertarProyecto(nombres);
			resp.sendRedirect("/index.jsp");
			//List<Proyecto> proyectos = ProyectoDao.listarProyecto();
			/*req.setAttribute("proyectos", proyectos);
			RequestDispatcher rd = getServletContext().getRequestDispatcher(
					"/ListarProyectos.jsp");
			rd.forward(req, resp);*/
			//Este es un comentario---- no m digas
		}
	}

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		if (req.getParameter("action").equals("listarProyectos")) {
			List<Proyecto> proyectos = ProyectoDao.listarProyecto();
			req.setAttribute("proyectos", proyectos);
			RequestDispatcher rd = getServletContext().getRequestDispatcher(
					"/ListarProyectos.jsp");
			rd.forward(req, resp);
		}
	}
}