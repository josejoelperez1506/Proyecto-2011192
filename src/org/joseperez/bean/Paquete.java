package org.joseperez.bean;

public class Paquete {
	private Integer idPaquete;
	private String receptor;
	private String emisor;
	private String fechaEntrega;
	private String fechaEmision;
	
	public Paquete(Integer idPaquete, String receptor, String emisor, String fechaEntrega, String fechaEmision) {
		super();
		this.idPaquete = idPaquete;
		this.receptor = receptor;
		this.emisor = emisor;
		this.fechaEntrega = fechaEntrega;
		this.fechaEmision = fechaEmision;
	}

	public Integer getIdPaquete() {
		return idPaquete;
	}

	public void setIdPaquete(Integer idPaquete) {
		this.idPaquete = idPaquete;
	}

	public String getReceptor() {
		return receptor;
	}

	public void setReceptor(String receptor) {
		this.receptor = receptor;
	}

	public String getEmisor() {
		return emisor;
	}

	public void setEmisor(String emisor) {
		this.emisor = emisor;
	}

	public String getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(String fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public String getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(String fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public Paquete() {
		super();
	}
	
	
}
