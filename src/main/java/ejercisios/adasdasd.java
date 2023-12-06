package ejercisios;

import java.util.Scanner;

public class adasdasd {

	public void pregunta1() {

		Scanner teclado = new Scanner(System.in);
		int numero1 = teclado.nextInt();
		System.out.println("ingrese eñ numero a");
		int numero2 = teclado.nextInt();
		System.out.println("ingrese eñ numero b");
		int numero3 = teclado.nextInt();

		if (numero1 > numero2) {
			if (numero1 > numero3) {
				System.out.println("El numero mayor es:" + numero1);
			} else {
				if (numero2 > numero1) {
					if (numero1 > numero3) {
						System.out.println("El numero mayor es :" + numero2);
					} else {
						if (numero3 > numero1) {
							if (numero1 > numero2) {
								System.out.println("El numero mayor es" + numero3);
							}
						}
					}
				}
			}
		}


	}

	public static void main(String[] args) {

	}

}
