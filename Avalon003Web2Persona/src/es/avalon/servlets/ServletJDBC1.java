package es.avalon.servlets;

import java.io.IOException;


import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import persistencia2es.avalon.persona.persistencia.Persona;



/**
 * Servlet implementation class ServletJDBC1
 */
@WebServlet("/ServletJDBC1")
public class ServletJDBC1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Persona> lista = Persona.buscarTodos();
		PrintWriter pw = response.getWriter();
		pw.print("<html><body>");

		pw.write("<h3>Lista Personas</h3>");
		
		pw.println("<table border=1px;>");
		
		pw.println("<tr>");	
		pw.println("<th>"+"NOMBRE"+"</th>");	
		pw.println("<th>"+"APELLIDOS"+"</th>");	
		pw.println("<th>"+"EDAD"+"</th>");	
		pw.println("<th>"+""+"</th>");	
		pw.println("<th>"+""+"</th>");	
		pw.println("</tr>");
		
		for (Persona ord : lista) {
			//pw.write("<p>" + ord.getNombre() + " " + ord.getApellidos() + " " + ord.getEdad() + " " +"<a href='ServletBorrar?nombre="+ord.getNombre()+"'>Borrar</a>"+ "   " +"<a href='ServletEditar?nombre="+ord.getNombre()+"'>Editar</a>"+"</p>");
			
			pw.println("<tr>");
			pw.println("<td>"+ord.getNombre()+"</td>");
			pw.println("<td>"+ord.getApellidos()+"</td>");
			pw.println("<td>"+ord.getEdad()+"</td>");
			pw.println("<td>"+"<a href='ServletBorrar?nombre="+ord.getNombre()+"'>Borrar</a>"+"</td>");
			pw.println("<td>"+"<a href='ServletEditar?nombre="+ord.getNombre()+"'>Editar</a>"+"</td>");
			pw.println("</tr>");
		}
		pw.println("</table >");
		pw.println("<a href='Formulario.html'>ir al formulario</a>");
		pw.println("</body></html>");
		
		
		
	
	}

}
