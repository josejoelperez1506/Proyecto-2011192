package org.joseperez.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.joseperez.db.Conexion;
import org.joseperez.bean.Paquete;

@WebServlet("/EliminarPaquete")

public class EliminarPaquete extends HttpServlet{
private static final long serialVersionUID = 1L;
   
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);	
	}


	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher despachador=null;
		Integer id = Integer.parseInt(req.getParameter("idPaquete"));
		Conexion.getInstancia().eliminar(Conexion.getInstancia().buscar(Paquete.class, id));
		despachador=req.getRequestDispatcher("ListarPaquete.do");
		despachador.forward(req, resp);
	}


}
