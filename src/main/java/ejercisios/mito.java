package ejercisios;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.plaf.OptionPaneUI;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

public class mito {

	public void pregunta1() {

		int numero = 5;
		/*
		 * Cree un aplicativo que declare una variable de tipo entero y asígnele un
		 * valor, determine si ese valor es positivo o negativo. Considere el número 0
		 * como positivo, para este ejercicio considere el uso del if tradicional y el
		 * if inline
		 */

		/*
		 * if (numero >= 0) { System.out.println("positivo"); } else {
		 * System.out.println("negativo"); } }
		 */

//if line

		String respuesta = numero >= 0 ? "positivo" : "negativo";
		System.out.println(respuesta);

	}

	public void pregunta2() {

		Scanner teclado = new Scanner(System.in);
		System.out.println("ingrese un numero");
		int numero = teclado.nextInt();
		/*
		 * if(numero %2 ==0 ) System.out.println("par"); else
		 * System.out.println("impar");
		 */

		String respuesta = (numero % 2 == 0 ? "par" : "impoar");
		System.out.println(respuesta);

		/*
		 * Cree un aplicativo que determine si el número ingresado por teclado es impar
		 * o par, para cada caso mostrar un mensaje considerando el if inline
		 */
		teclado.close();
	}

	public void pregunta3() {

		Scanner teclado = new Scanner(System.in);
		System.out.println("ingrese el numero 1:");
		int numero1 = teclado.nextInt();

		System.out.println("ingrese el numero 2:");
		int numero2 = teclado.nextInt();

		System.out.println("ingrese el numero 3:");
		int numero3 = teclado.nextInt();

		if (numero1 > numero2) {
			if (numero1 > numero3) {
				System.out.println("el numero mayor es : " + numero1);
			} else {
				System.out.println("el numero mayor es: " + numero3);
			}
		} else if (numero2 > numero3) {
			System.out.println("el numero mayor es: " + numero2);
		} else {
			System.out.println("el numero mayor es:" + numero3);
		}
		teclado.close();
		/*
		 * Calcular el mayor de tres números ingresados por teclado por el usuario
		 * (Evitar NullPointerException)
		 */

	}

	public void pregunta4() {

		Scanner teclado = new Scanner(System.in);
		System.out.println("ingrese el texto ");
		String texto = teclado.next();

		StringBuilder sb = new StringBuilder(texto);
		String reversa = sb.reverse().toString();
		String respuesta = texto.equalsIgnoreCase(reversa) ? "capicua" : " no es capicua";
		System.out.println(respuesta);
		teclado.close();

		/*
		 * Determinar si un valor ingresado por teclado es una cadena capicua (que se
		 * puede leer de derecha a izquierda y viceversa de la misma manera)
		 */

	}

	public void pregunta5() {

		/*
		 * Se requiere encriptar un mensaje, para ello se debe considerar lo siguiente
		 * a. La primera y última letra deberá ser cambiada por un número aleatorio
		 * entre 0 a 9
		 */

		Scanner teclado = new Scanner(System.in);
		System.out.println("ingrese cadena de texto");
		String texto = teclado.nextLine();

		Random generador = new Random();
		int numero = generador.nextInt(9);
		System.out.println(numero);

		teclado.close();

	}

	public void pregunta6() {

		/*
		 * Cree un aplicativo que simula un banco de datos para conversión de divisas a
		 * dólares, considere las siguientes divisas: a. Soles (3.368 soles = 1 dólar)
		 * b. Pesos Mexicanos (21 pesos = 1 dólar) Tener en cuenta las siguientes
		 * restricciones: - Límite máximo de dólares : 500 USD (Use una constante) - No
		 * aceptar valores negativos - No aceptar el valor CERO. Resultado Final -
		 * Mostrar el nombre de la persona quien recibirá el dinero (solicitar nombre
		 * inicialmente) - Mostrar el detalle de la operación realizada
		 */

		final int LIMITE_USD = 500;
		final double TIPO_CAMBIO_SOL = 3.36;
		final double TIPO_CAMBIO_PESO = 21;
		String nombre = JOptionPane.showInputDialog("Ingrese nombre de la persona");
		JOptionPane.showMessageDialog(null, "Bienvenido:" + nombre);

		String divisa = JOptionPane.showInputDialog("Seleccione Divisa \n 1-Soles \n 2-Pesos");
		JOptionPane.showMessageDialog(null, "Divisa Seleccionada: " + divisa);

		String monto = "";
		double conversion = 0.0;

		DecimalFormat df = new DecimalFormat("#.000");

		switch (divisa) {
		case "1":
			// sol
			monto = JOptionPane.showInputDialog("Ingrese monto en soles para convertir");
			conversion = Double.parseDouble(monto) / TIPO_CAMBIO_SOL;
			JOptionPane.showInternalMessageDialog(null, "El monto convertido es" + df.format(conversion));
			break;
		case "2":
			// pesos
			monto = JOptionPane.showInputDialog("Ingrese el monto en pesos para convertir");
			conversion = Double.parseDouble(monto) / TIPO_CAMBIO_PESO;
			JOptionPane.showMessageDialog(null, "El monto convertido es" + df.format(conversion));
			break;
		default:
			JOptionPane.showMessageDialog(null, "Divisa  Invalida");
			break;
		}

	}

	public void pregunta7() {

		/*
		 * Se desea controlar el stock (inventario) de un producto “ABC”, la cantidad
		 * inicial es de 50 existencias, se desea simular lo siguiente: a. Un cliente
		 * ingresa al sistema, e ingresa el usuario “user” con la clave “123”, de ser
		 * las credenciales correctas se le permitirá el acceso al mismo, caso contrario
		 * el programa finalizara (“exit”). b. Luego de iniciar sesión el sistema
		 * mostrará la cantidad inicial de existencias del producto “ABC” c. Mostrar un
		 * menú al usuario (consola) para que pueda seleccionar la opción deseada i.
		 * 1-Comprar Producto ii. 2-Devolver Producto d. Cuando seleccione la opción 1,
		 * el aplicativo deberá restar la cantidad comprada por el usuario, pero se debe
		 * validar que el cliente no pueda comprar más de la cantidad disponible para
		 * vender. e. Cuando seleccione la opción 2, el aplicativo deberá sumar la
		 * cantidad devuelta por el usuario, pero se debe validar que el cliente no
		 * pueda devolver más de 5 productos. f. Tras realizar la operación deseada se
		 * deberá mostrar un mensaje de la cantidad actual disponible.
		 */

		int existencias = 50;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese Usuario");
		String usuario = teclado.next();
		System.out.println("Ingresse Clave");
		String clave = teclado.next();

		if (usuario.equalsIgnoreCase("user") && clave.equalsIgnoreCase("123")) {
			System.out.println("Existensia actual:" + existencias);
			System.out.println("Elija una operacion; \n 1-Comprar Producto \n 2-Devolver Producto");
			int operacion = teclado.nextInt();
			int comprados = 0;
			switch (operacion) {
			case 1:
				System.out.println("Ingrese la cantidad de producto a comprar");
				comprados = teclado.nextInt();
				if (comprados > 0 && comprados < existencias) {
					existencias = existencias - comprados;
					System.out.println("Existencias Actual" + existencias);
				} else {
					System.out.println("Cantidad a comprar no permitida");
				}
				break;
			case 2:
				System.out.println("Ingrese cantidad de productos a devolver");
				comprados = teclado.nextInt();
				existencias = existencias + comprados;
				System.out.println("existencia actual" + existencias);
				break;
			default:
				break;
			}
		} else {

			System.out.println("Credenciales incorrectas");
			System.exit(0);
		}
		teclado.close();

	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		mito p = new mito();
		p.pregunta6();

	}

}
