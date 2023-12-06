package com.mitocode.fabrica;

public class Oracle implements BaseDatos {

	@Override
	public void conectarse() {
		System.out.println("conectandose a Oracle");
	}

}
