<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Editar Paquete</title>
</head>
<body>
	<form action="EditarPaquete.do" method="get">
		<input type="hidden" name="txtIdPaquete" value="${paquete.getIdPaquete()}">
		Receptor: <input type="text" name="txtReceptor" value="${paquete.getReceptor()}">
		Emisor: <input type="text" name="txtEmisor" value="${paquete.getEmisor()}">
		Fecha entrega: <input type="text" name="txtFechaEntrega" value="${paquete.getFechaEntrega()}">
		Fecha emision: <input type="text" name="txtFechaEmision" value="${paquete.getFechaEmision()}">
		<input type="submit" >
	</form>

</body>
</html>