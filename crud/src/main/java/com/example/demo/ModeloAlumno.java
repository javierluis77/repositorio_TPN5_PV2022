package com.example.demo;

public class ModeloAlumno {
//******ATRIBUTOS *****
	private int lu;
	private String nombre;
	private String Apellido;
	private int edad;
//****** METODOS *******	
	public ModeloAlumno(int lu, String nombre, String apellido, int edad) {
		
		this.lu = lu;
		this.nombre = nombre;
		Apellido = apellido;
		this.edad = edad;
	}
	public ModeloAlumno() {

	}
	
	public int getLu() {
		return lu;
	}

	public void setLu(int lu) {
		this.lu = lu;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
