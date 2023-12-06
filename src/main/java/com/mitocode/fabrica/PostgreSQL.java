package com.mitocode.fabrica;

public class PostgreSQL implements BaseDatos {

	@Override
	public void conectarse() {
		System.out.println("conectandose a PostgreSQL");
	}

}
