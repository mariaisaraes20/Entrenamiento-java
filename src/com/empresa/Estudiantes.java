package com.empresa;

public class Estudiantes {
	int numero;
	String nombre;

	public Estudiantes(int num, String nom) {
		numero = num;
		nombre = nom;
	}

	public void desplegar() {
		System.out.println("Numero es: " + numero + " Nombre es: " + nombre);
	}

	public static void main(String[] args) {
		Estudiantes estud = new Estudiantes(1, "Juan");
		estud.desplegar();
	}
}