package org.joseperez.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.joseperez.bean.Paquete;
import org.joseperez.db.Conexion;

@WebServlet("/EditarPaquete")
public class EditarPaquete extends HttpServlet{

	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req,resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher despachador = null;
		Paquete paquete = new Paquete(Integer.parseInt(req.getParameter("txtIdPaquete")),
				req.getParameter("txtReceptor"),
				req.getParameter("txtEmisor"),
				req.getParameter("txtFechaEntrega"),
				req.getParameter("txtFechaEmision"));
		Conexion.getInstancia().editar(paquete);
		despachador=req.getRequestDispatcher("ListarPaquete.do");
		despachador.forward(req, resp);
	}
	
}
