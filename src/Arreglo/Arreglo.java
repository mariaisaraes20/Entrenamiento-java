package Arreglo;

public class Arreglo {

	public static void main(String[] args) {
		int arreglo[] = new int[10];
		arreglo[0] = 12;
		arreglo[1] = 15;
		arreglo[2] = 22;
		arreglo[3] = 24;
		arreglo[4] = 29;
		arreglo[5] = 30;
		arreglo[6] = 34;
		arreglo[7] = 36;
		arreglo[8] = 38;
		arreglo[9] = 40;
		// System.out.println(arreglo[7]);

		for (int i = 0; i < arreglo.length; i++) {
			System.out.println(arreglo[i]);
		}

		int arregoDos[] = { 5, 10, 15, 20, 25, 30, 35 };
		System.out.println("El tamaño del segundo arreglo es:" + arregoDos.length);
	}
}
