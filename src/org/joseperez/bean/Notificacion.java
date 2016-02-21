package org.joseperez.bean;

public class Notificacion {
	private Integer idNotificacion;
	private String mensaje;
	private String fecha;
	public Integer getIdNotificacion() {
		return idNotificacion;
	}
	public void setIdNotificacion(Integer idNotificacion) {
		this.idNotificacion = idNotificacion;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public Notificacion(Integer idNotificacion, String mensaje, String fecha) {
		super();
		this.idNotificacion = idNotificacion;
		this.mensaje = mensaje;
		this.fecha = fecha;
	}
	public Notificacion() {
		super();
	}
	
}
