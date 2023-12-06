package Corroborando;

public class Automovil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Instanciar

		Piezas a = new Piezas();
		Piezas b = new Piezas();
		String modelo;
		String modelo1;
		int año1;
		int año;

		// llenando la informacion

		a.setModelo("Hyundai");
		a.setAño(2008);

		b.setModelo("Toyota");
		b.setAño(2012);

		modelo = a.getModelo();
		año = a.getAño();

		modelo1 = b.getModelo();
		año1 = b.getAño();

		// sout

		System.out.println("El modelo del auto es:" + modelo + " / " + modelo1);
		System.out.println("El año del auto es:" + año + " / " + año1);

	}

}
