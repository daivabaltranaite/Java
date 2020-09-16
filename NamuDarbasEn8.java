import java.util.Scanner;

public class NamuDarbasEn8 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int a, b, suma;
		System.out.print("Type a number: ");
		a = reader.nextInt();
		System.out.print("Type another number: ");
		b = reader.nextInt();

		suma = a + b;
		System.out.println();
		System.out.println("Sum of the numbers: " + suma);

		reader.close();
	}
}
