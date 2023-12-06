package ejercisios;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayvsSet {
	public static void main(String[] args) {
		
		
		List<String> listaArray = new ArrayList<>();
		Set<String> setHash = new HashSet<>();
		
		//Treeset -> orden alfabetico
		
		listaArray.add("Mitocode");
		listaArray.add("mitocode");
		listaArray.add("code");
		
	 listaArray.forEach(System.out::println);
	 
	 System.out.println("--------------------");
	 
	 setHash.add("mitocode");
	 setHash.add("mitocode");
	 setHash.add("code");
	 setHash.add("jaime");
	 setHash.add("AAA");
	
 setHash.forEach(System.out::println); 
		
		
		
	}

}
