package ejercisios;

import java.util.Scanner;

import javax.management.loading.PrivateClassLoader;
import javax.sound.midi.SysexMessage;

public class Cifrado {

	public static void main(String[] args) {

		/*
		 * final String[] ABC = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K",
		 * "L", "M", "N", "O", "P", "Q", "T", "U", "V", "W", "X", "Y", "Z" };
		 * 
		 * 
		 * Scanner teclado = new Scanner(System.in);
		 * System.out.println("Ingrese cadena a cifrar"); String texto = teclado.next();
		 * // hector System.out.println("tamaño de texto "+texto.length());
		 * System.out.println("Ingrese nivel del cifrado"); int deaplazamiento =
		 * teclado.nextInt(); //30
		 * 
		 * for (int i = 0; i < texto.length(); i++) { char elemento = texto.charAt(i);
		 * // I =0 h for (int j = 0; j < ABC.length; j++) { //j=0 if
		 * (String.valueOf(elemento).equalsIgnoreCase(ABC[j])) { //elemento == ABC[j] H
		 * = H int posicion = j + deaplazamiento; if (posicion >= ABC.length) { int x =
		 * posicion - ABC.length; String cifrado = ABC[x]; System.out.println(cifrado);
		 * break; } else { String cifrado = ABC[posicion]; System.out.println(cifrado);
		 * break; } } } }
		 * 
		 * teclado.close();
		 */
		/*
		 *  
		 * 
		 * 
		 * */

		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese cadena a cifrar");
		String texto = teclado.next();
		System.out.println("Ingrese el indice");
		int indice = teclado.nextInt();
		// validando
		if (indice > texto.length()) {
			System.out.println("Esto es un error");

		} else {
			char resultado = texto.charAt(indice - 1);
			System.out.println("resultado es :" + "----------->" +  resultado);
		}

	}

}
