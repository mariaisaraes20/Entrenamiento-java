package string;

public class StringBuilderClass {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hola ");
		sb.append("mundo");
		sb.insert(5, "Java ");
		sb.replace(0, 4, "Reemplazo");
		sb.reverse();
		System.out.println(sb);
	}
}
