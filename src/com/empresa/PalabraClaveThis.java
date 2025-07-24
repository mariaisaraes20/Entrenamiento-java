package com.empresa;

public class PalabraClaveThis {
	int numeroMatricula;
	String nombre;
	String grado;

	public PalabraClaveThis(int numeroMatricula, String nombre, String grado) {
		this.numeroMatricula = numeroMatricula;
		this.nombre = nombre;
		this.grado = grado;
	}

	public void display() {
		System.out.println("Numero de matricula: " + numeroMatricula + " Nombre es: " + nombre + " Clase: " + grado);
	}

	public static void main(String[] args) {
		PalabraClaveThis est = new PalabraClaveThis(10, "Juan", "Segundo");
		est.display();
	}
}
