package string;

public class StringMethodos {

	public static void main(String[] args) {
		String saludo = "Hola Mundo";
		System.out.println(saludo.charAt(3));
		System.out.println("Longitud:" + saludo.length());
		System.out.println("Mayuscula:" + saludo.toUpperCase());
		System.out.println("Contiene'mun'? " + saludo.contains("Mun"));
		System.out.println("Remmplazo " + saludo.replace("Mundo", "Java"));
		System.out.println(saludo.concat(" Bello"));
		System.out.println("Termina en 'Hola'? " + saludo.endsWith("Hola"));

		String textUno = "Hola Mundo";
		System.out.println(textUno.equals(saludo));
		System.out.println("Indice de 'M' " + saludo.indexOf("Mundo"));
		System.out.println("Indice de 'Mundo' " + saludo.indexOf("Mundo"));
		System.out.println("Indice de 'Mundo' " + saludo.indexOf("Pete"));
	}
}