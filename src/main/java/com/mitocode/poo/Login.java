package com.mitocode.poo;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Login {

	// CREAR UN MECANISMO PARA REGISTRAR UN USUARIO
	// ESTOS DEBERAN REGISTRAR UN NOMBRE DE USUARIO(16) Y CLAVE(10)
	// LA CLAVE DEBERA SER ENCRIPTADA MEDIAN EL METODO CESAR DE NIVEL
	// INDICANDO POR EL USUARIO
	// UTILIZAR POO EN TODO MOMENTO

	
	public void registrar(Usuario usu,Encriptacion enc) {
	//	String claveEncriptada = this.encriptar(usu, enc);
		//usu.setClave(claveEncriptada);
		JOptionPane.showMessageDialog(null, usu.getNombre() + "-" + usu.getClave());
	}

	//public String encriptar(Usuario u);
		//String calveEncriptada = encriptar(u);
		//return calveEncriptada;

	//}


	public static void main(String[] args) {
		Usuario objeto = new Usuario();
		objeto.setId(1);
		objeto.setNombre("mito");
		objeto.setClave("admin");
		
		Encriptacion en = new Encriptacion();
	//	en.setNombre("Cesar");
	//	en.setNivel(2);
	
		Login app = new Login();
		app.registrar(objeto, en);


}

}
