package org.joseperez.bean;

public class Costo {
	private Integer idCosto;
	private Double costoAdicional;
	private Double envio;
	private Producto idProducto;
	
	public Integer getIdCosto() {
		return idCosto;
	}
	public void setIdCosto(Integer idCosto) {
		this.idCosto = idCosto;
	}
	public Double getCostoAdicional() {
		return costoAdicional;
	}
	public void setCostoAdicional(Double costoAdicional) {
		this.costoAdicional = costoAdicional;
	}
	public Double getEnvio() {
		return envio;
	}
	public void setEnvio(Double envio) {
		this.envio = envio;
	}
	public Producto getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(Producto idProducto) {
		this.idProducto = idProducto;
	}
	public Costo(Integer idCosto, Double costoAdicional, Double envio, Producto idProducto) {
		super();
		this.idCosto = idCosto;
		this.costoAdicional = costoAdicional;
		this.envio = envio;
		this.idProducto = idProducto;
	}
	public Costo() {
		super();
	}

	
}
