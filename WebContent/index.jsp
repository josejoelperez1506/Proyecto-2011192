
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%
		HttpSession sesion=request.getSession();
		Object user=sesion.getAttribute("usuario");
		if(user!=null){
			response.sendRedirect("/ProyectoFinal2011192/Admin/dashboard.jsp");
		}
	%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" href="CSS/Estilo.css">
<!--[if lt IE 9]><script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
</head>
<body>
	<section class="container">
	<div class="login">
		<h1>Login</h1>
		<form method="post" action="AutenticarUsuario.do">
			<p>
				<input type="text" name="txtNombre" value=""
					placeholder="Usuario o Email">
			</p>
			<p>
				<input type="password" name="txtPassword" value=""
					placeholder="Contraseña">
			</p>
			<p class="remember_me">
				<label> <input type="checkbox" name="remember_me"
					id="remember_me"> Recordarme en esta computadora.
				</label>
			</p>
			<p class="submit">
				<input type="submit" name="commit" value="Login">
			</p>
		</form>
		${error}
		<%= (request.getParameter("error")!=null)?request.getParameter("error"):""%>
	</div>

	<div class="login-help">
		<p>
			Olvidaste tu contraseña? <a href="index.jsp">Reestablecer la
				contraseña</a>.
		</p>
	</div>
	</section>
</body>
</html>

