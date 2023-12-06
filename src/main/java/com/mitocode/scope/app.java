package com.mitocode.scope;

public class app {
	public static void main(String[] args) {
		Protegido app = new Protegido();
		app.apellido = "code";
		System.out.println(app.apellido);
		app.metodo();
	}

}
