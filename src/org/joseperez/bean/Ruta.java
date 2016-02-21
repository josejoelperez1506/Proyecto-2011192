package org.joseperez.bean;

public class Ruta {
	
private Integer idRuta;
private String ruta1;
private String ruta2;

public Integer getIdRuta() {
	return idRuta;
}
public void setIdRuta(Integer idRuta) {
	this.idRuta = idRuta;
}
public String getRuta1() {
	return ruta1;
}
public void setRuta1(String ruta1) {
	this.ruta1 = ruta1;
}
public String getRuta2() {
	return ruta2;
}
public void setRuta2(String ruta2) {
	this.ruta2 = ruta2;
}
public Ruta(Integer idRuta, String ruta1, String ruta2) {
	super();
	this.idRuta = idRuta;
	this.ruta1 = ruta1;
	this.ruta2 = ruta2;
}
public Ruta() {
	super();
	// TODO Auto-generated constructor stub
}



}
