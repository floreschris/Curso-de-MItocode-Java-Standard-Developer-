package com.mitocode.fabrica;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

public class App {
	
	public static void main(String[] args) {
		
		BaseDatosFabric fabrica = new BaseDatosFabric();
		BaseDatos bd =fabrica.getBaseDatos("oracle");
		
		
		bd.conectarse();
	}
	

}
