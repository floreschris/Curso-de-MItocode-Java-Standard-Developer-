package com.mitocode.collecciones;

import java.util.Objects;

public class Persona extends SetApp {

	private int codigo;
	private String nombre;
	private String edad;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo, edad, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return codigo == other.codigo && Objects.equals(edad, other.edad) && Objects.equals(nombre, other.nombre);
	}

}
