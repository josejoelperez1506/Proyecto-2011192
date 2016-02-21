package org.joseperez.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.joseperez.bean.Usuario;
import org.joseperez.db.Conexion;

@WebServlet("/AutenticarUsuario")
public class AutenticarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher despachador = null;
		List<Object> usuarios = Conexion.getInstancia().autenticar(req.getParameter("txtNombre"),
				req.getParameter("txtPassword"));
		if (usuarios != null && usuarios.size() > 0) {
			HttpSession sesion = req.getSession(true);
			sesion.setAttribute("usuario", (Usuario) usuarios.get(0));

			despachador = req.getRequestDispatcher("Admin/dashboard.jsp");
		} else {
			req.setAttribute("error", "verifica tus credenciales");
			despachador = req.getRequestDispatcher("index.jsp");
		}
		despachador.forward(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
}