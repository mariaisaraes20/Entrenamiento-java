package com.empresa;

public class VariableDeInstancia {
	String Nombre;

	void mostrarNombre() {
		System.out.println("Nombre:" + Nombre);
	}

	public static void main(String[] args) {
		VariableDeInstancia p1 = new VariableDeInstancia();
		p1.Nombre = "Maria";
		p1.mostrarNombre();
	}
}
