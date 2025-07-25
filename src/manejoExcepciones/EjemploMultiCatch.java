package manejoExcepciones;

import java.io.FileReader;
import java.io.IOException;

public class EjemploMultiCatch {
	public static void main(String[] args) {
		try {
			int resultado = 10 / 2;
			FileReader file = new FileReader("Archivo.txt");
		} catch (ArithmeticException | IOException e) {
			System.out.println("Ocurrio una excepcion");
			System.out.println(e.getClass().getSimpleName());
		}
	}
}
