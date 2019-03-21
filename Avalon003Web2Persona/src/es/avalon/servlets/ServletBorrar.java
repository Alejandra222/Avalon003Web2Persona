package es.avalon.servlets;

import java.io.Console;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import persistencia2es.avalon.persona.persistencia.Persona;





/**
 * Servlet implementation class ServletBorrar
 */
@WebServlet("/ServletBorrar")
public class ServletBorrar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String modelo = request.getParameter("nombre");
		
		Persona borro_Ordenador = new Persona(modelo);
		borro_Ordenador.deleteOrdenador();
		
//		try {
//			Ordenador.deleteOrdenador(modelo);
//		} catch (Exception e) {
//			System.out.println("Error al eliminar "+e);
//			//e.printStackTrace();
//	
//		}
		response.sendRedirect("ServletJDBC1");
	}



}
