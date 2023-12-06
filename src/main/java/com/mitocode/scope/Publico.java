package com.mitocode.scope;

public class Publico {

	public int id;
	public String nombre;
	public String apellido;

	public void metodoA() {
		this.metodoB();
		System.out.println("metodo publico");
	}

	private void metodoB() {
		System.out.println("metodo privado");
	}
}
