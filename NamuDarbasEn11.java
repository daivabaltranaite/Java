import java.util.Scanner;

public class NamuDarbasEn11 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int a, b, maxResult;
		System.out.print("Type the number: ");
		a = reader.nextInt();
		System.out.print("Type another number: ");
		b = reader.nextInt();

		maxResult = Math.max(a, b);

		System.out.println();
		System.out.println("The bigger number of the two numbers given was: " + maxResult);

		reader.close();
	}
}
