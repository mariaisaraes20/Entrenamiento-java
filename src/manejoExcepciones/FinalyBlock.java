package manejoExcepciones;

public class FinalyBlock {

	public static void main(String[] args) {
		Integer resultado = null;
		try {
			System.out.println("Intentando dividir");
			resultado = 10 / 0;
			System.out.println("Resultado: " + resultado);
			System.out.println("Guardando resultado en la base de datos");
		} catch (ArithmeticException e) {
			System.out.println("Error: division por cero");
		} finally {
			System.out.println("Cerrando conexión a la base de datos");
		}
	}
}
