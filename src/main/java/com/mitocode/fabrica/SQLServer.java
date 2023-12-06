package com.mitocode.fabrica;

public class SQLServer implements BaseDatos {

	@Override
	public void conectarse() {
		System.out.println("conectandose a SQLServer");
	}

}
