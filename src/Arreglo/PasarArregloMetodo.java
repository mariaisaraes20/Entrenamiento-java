package Arreglo;

public class PasarArregloMetodo {

	public static void Encontrar(int arreglo[]) {
		int min = arreglo[0];
		for (int i = 0; i < arreglo.length; i++) {
			if (min > arreglo[i]) {
				min = arreglo[i];
			}
		}
		System.out.println("El elemento menor es: " + min);
	}

	public static int[] getArreglo() {
		return new int[] { 2, 4, 6, 1, 10, 12, 14, 16 };
	}

	public static void main(String[] args) {
		PasarArregloMetodo arr = new PasarArregloMetodo();
		int arregloPrueba[] = { 3, 6, 1, 5, 10, 80 };
		arr.Encontrar(arregloPrueba);
		
		int arreglodos[]= arr.getArreglo();
		System.out.println(arreglodos[2]);
	}

}
