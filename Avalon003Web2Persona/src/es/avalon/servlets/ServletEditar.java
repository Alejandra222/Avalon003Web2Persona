package es.avalon.servlets;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import persistencia2es.avalon.persona.persistencia.Persona;



/**
 * Servlet implementation class ServletEditar
 */
@WebServlet("/ServletEditar")
public class ServletEditar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String nombre = request.getParameter("nombre");
		Persona or = Persona.buscarUnOrdenadorPorModelo(nombre);
		
		PrintWriter pw = response.getWriter();
		pw.print("<html><body><form action='ServletSalvar' method='post'>");
		pw.print("<p>Nombre:<input type= 'text' name='nombre' value='"+or.getNombre()+"'/></p>");
		
		pw.print("<p>Nombre:<input type= 'hidden' name='nombreOculto' value='"+or.getNombre()+"'/></p>");
		
		pw.print("<p>Apellidos:<input type= 'text' name='apellidos' value='"+or.getApellidos()+"'/></p>");
		pw.print("<p>Edad:<input type= 'text' name='edad' value='"+or.getEdad()+"'/></p>");

		
		pw.print("<p><input type ='submit' value='salvar'></p>");
		pw.print("</form></html></body>");
		
		//response.sendRedirect("ServletJDBC1");
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
