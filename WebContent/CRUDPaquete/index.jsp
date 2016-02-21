<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inicio</title>
</head>
<body>
	<h1>Listado de Paquetes</h1>
	<a href="CRUDPaquete/agregar.jsp">Agregar Paquete</a>
	<table>
		<thead>
			<th>Receptor</th>
			<th>Emisor</th>
			<th>Fecha Entrega</th>
			<th>Fecha Emision</th>
		</thead>
		<tbody>
			<c:forEach items="${listaPaquete}" var="paquete">
				<tr>
					<td>${paquete.getReceptor()}</td>
					<td>${paquete.getEmisor()}</td>
					<td>${paquete.getFechaEntrega()}</td>
					<td>${paquete.getFechaEmision()}</td>
					<td><a
						href="EliminarPaquete.do?idPaquete=${paquete.getIdPaquete()}">Eliminar</a></td>
					<td><a
						href="CargarPaquete.do?idPaquete=${paquete.getIdPaquete()}">Editar</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>