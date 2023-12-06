package com.mitocode.collecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetApp{

	private Set<Persona> lista;

	public SetApp() {
		lista = new  HashSet<>();
	}


	public void llenar() {

	
		/*lista.add(new Persona (1,"jaime",26));
		lista.add(new Persona (2,"mito",27));
		lista.add(new Persona (3,"lucas",29));
		lista.add(new Persona (4,"code",22));
		lista.add(new Persona (5,"jaime",19));
	}*/
	
	//public void imprimir() {
		//lista.forEach(System.out::println);
	//for(Integer elemento : lista) {
	//	System.out.println(elemento.get);
	}
	
	//}
	public static void main(String[] args) {
	SetApp app =new SetApp();
	app.llenar();
	//app.imprimir();
	
	
	//c.desordenar();
	}

}