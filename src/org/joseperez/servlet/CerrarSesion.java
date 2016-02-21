package org.joseperez.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.joseperez.db.Conexion;

@WebServlet("/CerrarSesion")
public class CerrarSesion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher despachador=null;
		req.getSession().invalidate();
		req.getSession().removeAttribute("usuario");
		Conexion.getInstancia().closeSession();
		despachador=req.getRequestDispatcher("index.jsp");
		despachador.forward(req, resp);

	}

}
