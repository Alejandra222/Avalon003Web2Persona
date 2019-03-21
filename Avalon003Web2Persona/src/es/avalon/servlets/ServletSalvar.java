package es.avalon.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import persistencia2es.avalon.persona.persistencia.Persona;



/**
 * Servlet implementation class ServletSalvar
 */
@WebServlet("/ServletSalvar")
public class ServletSalvar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//Ejemplo1 actualizar
		String modelo_Actualizar = request.getParameter("nombre");
		String marca_Actualizar = request.getParameter("apellidos");
		int precio_Actualizar = Integer.parseInt(request.getParameter("edad"));
	
		Persona salvar_ordenador = new Persona(modelo_Actualizar, marca_Actualizar, precio_Actualizar);
		salvar_ordenador.updateOrdenado();
		
		//Ejemplo2 eliminar e insertar
		
//		String modeloOculto = request.getParameter("modeloOculto");
//		Ordenador buscoParaEliminar = Ordenador.buscarUnOrdenadorPorModelo(modeloOculto);
//		buscoParaEliminar.deleteOrdenador();		
//		
//		String modelo_Insertar = request.getParameter("modelo");
//		String marca_Insertar = request.getParameter("marca");
//		double precio_Insertar = Double.parseDouble(request.getParameter("precio"));
//	
//		Ordenador o = new Ordenador(modelo_Insertar, marca_Insertar, precio_Insertar);
//		o.insertarOrdenador();
		
		response.sendRedirect("ServletJDBC1");
	}

}
