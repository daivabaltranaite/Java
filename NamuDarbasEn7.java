import java.util.Scanner;

public class NamuDarbasEn7 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int a, b, daugyba;

		System.out.println("Ivesk pirma skaiciu:");
		a = reader.nextInt();
		System.out.println("Ivesk antra skaiciu:");
		b = reader.nextInt();

		daugyba = a * b;

		System.out.println(a + " * " + b + " = " + daugyba);
		System.out.println();

		reader.close();

	}

}
