package com.mitocode.fabrica;

import javax.validation.Path.ReturnValueNode;

public class BaseDatosFabric {

	public BaseDatos getBaseDatos(String tipo) {
		if (tipo == null) {
			return null;

		}
		if (tipo.equalsIgnoreCase("MySQL")) {
			return new MySQL();
		} else if (tipo.equalsIgnoreCase("Oracle")) {

			return new Oracle();
		} else if (tipo.equalsIgnoreCase("PostgreSQL")) {
			return new PostgreSQL();

		} else if (tipo.equalsIgnoreCase("SQLServer")) {
			return new SQLServer();
		}
		return null;

	}

}
