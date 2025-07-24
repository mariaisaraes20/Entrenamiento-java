package com.empresa;

public class CondicionaesIf {
	public static void main(String[] args) {
		String var1 = "Hola";
		String var2 = "Equipo";

		int a = 300;
		int b = 200;

		if (a < 1000) {
			System.out.println(a + " Es menor que 1000");
		} else {
			System.out.println(a + " Es mayor que 1000");
		}

		if (a == 100) {
			System.out.println("A:" + a + " Es 100");
		} else if (a == 200) {
			System.out.println("A:" + a + " Es 200");
		} else if (a == 300) {
			System.out.println(a + " Es 300");
		} else {
			System.out.println("A:" + a + " No es igual a ninguno de los números");
		}
	}
}
