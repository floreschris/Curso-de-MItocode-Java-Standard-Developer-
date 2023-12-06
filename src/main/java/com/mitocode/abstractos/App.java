package com.mitocode.abstractos;

public class App {

	public static void main(String[] args) {
		
		IVehiculo vehi = new Auto();
		System.out.println(vehi.mostrarMarca());
		System.out.println(vehi.mostrarPrecio());
		
		
		vehi = new Bus();
		System.out.println(vehi.mostrarMarca());
		
		
		
		
		
		
	}
}
