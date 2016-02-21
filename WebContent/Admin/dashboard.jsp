<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ include file="../include/validarsesion.jsp" %>    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="CSS/Estilo2.css">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Administrador</title>
</head>
<body>
<div>
	
	<h1>BIENVENIDO ${usuario.getNombre()}</h1>

			<p class="ListarPaquete">
				<label>
			<a href="ListarPaquete.do"> Operaciones sobre Paquetes</a>
				</label>
			</p>
			
			<p class="CerrarSesion">
				<label>
			<a href="CerrarSesion.do"> Cerrar Sesion</a>
				</label>
			</p>
	</div>
</body>