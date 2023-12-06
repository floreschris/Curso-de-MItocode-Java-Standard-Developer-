package com.mitocode.collecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Coleccion {

	private List<Integer> lista;

	public Coleccion() {
		lista = new ArrayList<>();
	}

	public void desordenar() {
		Collections.shuffle(lista);

	}

	public void inertir() {
		
		

	}
	
	public void imprimir() {
		//lista.forEach(System.out::println);
	for(Integer elemento : lista) {
		System.out.println(elemento);
	}
	
	
	}

	public void llenar() {
		lista.add(1);
		lista.add(3);
		lista.add(2);
		lista.add(4);
		lista.add(5);
	}

	public static void main(String[] args) {
		Coleccion c = new Coleccion();
		c.llenar();
		c.inertir();
		c.imprimir();
		//c.desordenar();
	}

}
