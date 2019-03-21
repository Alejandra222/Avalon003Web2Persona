package es.avalon.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import persistencia2es.avalon.persona.persistencia.Persona;



/**
 * Servlet implementation class ServletJDBCInsertar
 */
@WebServlet("/ServletJDBCInsertar")
public class ServletJDBCInsertar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String modelo = request.getParameter("nombre");
		String marca = request.getParameter("apellidos");
		int precio = Integer.parseInt(request.getParameter("edad"));
	
		Persona o = new Persona(modelo, marca, precio);
		o.insertarOrdenador();
		response.sendRedirect("ServletJDBC1");
	}

	

}
