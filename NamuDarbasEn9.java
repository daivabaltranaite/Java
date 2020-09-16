import java.util.Scanner;

public class NamuDarbasEn9 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int a, b;
		System.out.print("Type a number: ");
		a = reader.nextInt();
		System.out.print("Type another number: ");
		b = reader.nextInt();
		double div = (double) a / b;

		System.out.println();
		System.out.println("Division: " + a + " / " + b + " = " + div);

		reader.close();
	}
}
