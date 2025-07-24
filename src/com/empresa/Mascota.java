package com.empresa;

public class Mascota {
	String Nombre = "Balto";
	String Raza = "Criollo";
	int altura = 4;

	public void ladrar() {
		System.out.println(Nombre + " esta ladrando");
	}

	public static void main(String[] args) {

		Mascota perro = new Mascota();
		System.out.println(perro.altura);
		perro.ladrar();
	}
}
