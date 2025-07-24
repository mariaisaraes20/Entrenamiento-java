package com.empresa;

public class SwitchCase {
	public static void main(String[] args) {
		int dia = 8;
		String modulo = "Presupuesto";

		switch (dia) {
		case 1:
			System.out.println("Este es el dia Lunes");
			break;
		case 2:
			System.out.println("Este es el dia Martes");
			break;
		case 3:
			System.out.println("Este es el dia Miércoles");
			break;
		case 4:
			System.out.println("Este es el dia Jueves");
			break;
		case 5:
			System.out.println("Este es el dia Viernes");
			break;
		case 6:
			System.out.println("Este es el dia Sábado");
			break;
		case 7:
			System.out.println("Este es el dia Domingo");
			break;
		default:
			System.out.println("Dia no válido");
		}

		switch (modulo) {
		case "Contabilidad":
			System.out.println("Ingreso al módulo de contabilidad");
			break;
		case "Presupuesto":
			System.out.println("Ingreso al módulo de presupuesto");
			break;
		case "Tesoreria":
			System.out.println("Ingreso al módulo de tesoreria");
			break;
		case "Nomina":
			System.out.println("Ingreso al módulo de nomina");
			break;
		case "Inventario":
			System.out.println("Ingreso al módulo de inventario");
			break;
		case "Indycom":
			System.out.println("Ingreso al módulo de industria y comercio");
			break;
		case "Predial":
			System.out.println("Ingreso al módulo de predial");
			break;
		default:
			System.out.println("Regrese a la página y escoja un módulo");
		}
	}
}
