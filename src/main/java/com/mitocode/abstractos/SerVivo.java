package com.mitocode.abstractos;

public abstract class SerVivo {

	private String nombre;

	abstract void alimentar();

	abstract void dormir();


	public void respirar() {
		System.out.println("Respirando......");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
