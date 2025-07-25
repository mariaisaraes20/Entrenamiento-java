package manejoExcepciones;

import java.util.Scanner;

public class Excepciones {
	public static void main(String[] args) {
		try {
			String texto = "juan";
			System.out.println(texto.length());
		} catch (NullPointerException e) {
			System.out.println("Error: estás intentanto acceder a un objeto nulo.");
		}

		int numero = perdirNumeroEntero();
		System.out.println("Número ingresado correctamente: " + numero);

	}

	public static int perdirNumeroEntero() {
		Scanner scanner = new Scanner(System.in);
		int numero = 0;
		boolean a = false;
		while (!a) {
			System.out.println("Ingrese un número entero: ");
			String entrada = scanner.nextLine();
			try {
				numero = Integer.parseInt(entrada);
				a = true;
			} catch (NumberFormatException e) {
				System.out.println("Error: No ingresaste un número válido, intente de nuevo");
			}
		}
		scanner.close();
		return numero;
	}
}
