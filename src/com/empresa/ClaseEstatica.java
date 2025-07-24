package com.empresa;

public class ClaseEstatica {
	int i = 0;
	static int j = 0;

	public static void main(String[] args) {
		// System.out.println(ClaseEstatica.i); // la i pertenece al objeto no a la
		// clase
		System.out.println(ClaseEstatica.j);
		ClaseEstatica a = new ClaseEstatica();
		System.out.println(a.i);

		int resultado = ClaseEstatica.sumar(3, 4);
		System.out.println(resultado);
	}

	public static int sumar(int a, int b) {
		return a + b;
	}
}
