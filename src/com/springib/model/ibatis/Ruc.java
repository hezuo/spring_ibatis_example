package com.springib.model.ibatis;

public class Ruc {
	private int id;
	private String nombre;
	private String ruc;
	private String dni;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String toString(){
		return this.getNombre() + " " + this.getRuc();
	}
	
	

}
