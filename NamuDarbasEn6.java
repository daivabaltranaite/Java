import java.util.Scanner;

public class NamuDarbasEn6 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int a, b, suma;
		System.out.println("Ivesk pirma skaiciu:");
		a = reader.nextInt();
		System.out.println("Ivesk antra skaiciu:");
		b = reader.nextInt();

		suma = a + b;

		System.out.println(a + " + " + b + " = " + suma);
		System.out.println();

		reader.close();
	}
}
