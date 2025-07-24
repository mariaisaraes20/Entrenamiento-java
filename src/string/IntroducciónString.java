package string;

public class IntroducciónString {

	public static void main(String[] args) {
		String nombreUno = "Juan Perez";
		String nombreDos = "Juan Perez";
		String nombreTres = "Juanita";
		String paisUno = new String("Colombia");
		String paisDos = new String("Colombia");
		System.out.println(nombreUno.equals(nombreDos));
		System.out.println(nombreUno.equals(nombreTres));
		System.out.println(nombreUno.equalsIgnoreCase(nombreDos));
		System.out.println(paisUno.equals(paisUno));

		System.out.println(nombreUno == nombreDos);
		System.out.println(paisUno == paisDos);

		// Concatenación
		String finalString = nombreUno + nombreDos + nombreTres;
		System.out.println(finalString);
		String segundoString = nombreUno.concat(nombreDos).concat(nombreTres);
		System.out.println(segundoString);
	}
}
