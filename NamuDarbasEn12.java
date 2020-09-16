import java.util.Scanner;

public class NamuDarbasEn12 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int age1, age2, sum;
		String name1, name2;

		System.out.print("Type your name: ");
		name1 = reader.next();
		System.out.print("Type your age: ");
		age1 = reader.nextInt();
		System.out.println();
		System.out.print("Type your name: ");
		name2 = reader.next();
		System.out.print("Type your age: ");
		age2 = reader.nextInt();
		System.out.println();

		sum = age1 + age2;

		System.out.println(name1 + " and " + name2 + " are " + sum + " years old in total.");

		reader.close();
	}
}
