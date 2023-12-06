package com.mitocode.abstractos;


//@FunctionalInterface
public interface IDefault {

	void mostrar();

	void saludar();
	
	

	default void calcular() {

		System.out.println("logica");
	}

}
