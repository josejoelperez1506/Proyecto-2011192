package org.joseperez.bean;

public class Producto {
	private Integer idProducto;
	private String nombre;
	private String marca;
	private String tipo;
	private Double precio;
	public Integer getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Producto(Integer idProducto, String nombre, String marca, String tipo, Double precio) {
		super();
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.marca = marca;
		this.tipo = tipo;
		this.precio = precio;
	}
	public Producto() {
		super();
	}
	
}
