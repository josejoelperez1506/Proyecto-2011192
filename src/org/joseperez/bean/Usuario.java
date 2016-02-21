package org.joseperez.bean;

public class Usuario {
	private Integer idUsuario;
	private String nombre;
	private String nick;
	private String contrasena;
	private Rol idRol;
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public Rol getIdRol() {
		return idRol;
	}
	public void setIdRol(Rol idRol) {
		this.idRol = idRol;
	}
	public Usuario(Integer idUsuario, String nombre, String nick, String contrasena, Rol idRol) {
		super();
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.nick = nick;
		this.contrasena = contrasena;
		this.idRol = idRol;
	}
	public Usuario() {
		super();
	
	
	
}
}