package ejercisios;

import java.util.ArrayList;
import java.util.Iterator;

public class ciclos {

	public static void main(String[] args) {
		
	
		String[] arreglo = {"mito","code"};	
	
		ArrayList lista = new ArrayList <>();
		lista.add("mito");
		lista.add("code");
		
		
		//1.5
		Iterator it = lista.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		//1.6
		
		for(int i = 0 ; i < lista.size();i++) {
	//		System.out.println(lista.get[i]);
		}
		
		//1.7
		for(Object elemento : lista ) {
			System.out.println(elemento);
		}
		
		//1.8
		//(landa) lista.forEach(x -> System.out.println(x)));
		lista.stream().forEach(System.out::println);
		
		
	}
	
	
}
