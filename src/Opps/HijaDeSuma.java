package Opps;

public class HijaDeSuma extends Sumar {

	public static void main(String[] args) {
		Sumar ad = new Sumar();
		ad.sumar(2, 3);
		ad.Sumar(10, 40, 50);
		double d = ad.sumar(2.5, 1.5, 2.4);
		System.out.println(d);
	}
}
