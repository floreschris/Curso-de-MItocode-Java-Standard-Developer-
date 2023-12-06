package com.mitocode.poo;

import java.io.Serializable;

public class Bean  implements Serializable{

	// parece al pojo , super pojoooo

		private int id;
		private String nombre;
		private String apellido;

		public Bean() {

		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

	}
