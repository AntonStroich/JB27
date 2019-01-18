package by.cdp.jb27.antonstroich.lesson4;

import java.util.Scanner;

public class Mass01 {

	public static void main(String[] args) {
		int massLenght = Mass01.inputMassLength();

		int[] mas = new int[massLenght];

		int divider = Mass01.getDivider();

		Mass01.fillMass(mas);

		int sum = Mass01.takeMassSum(mas, divider);
		Mass01.printResult(sum);

	}

	public static int inputMassLength() {
		int massLength = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Please enter a positive value to se up the massive length: ");

			while (!sc.hasNextInt()) {
				System.out.println("You have entered invalid value! Please try again! ");
				sc.next();
			}

			massLength = sc.nextInt();

		} while (massLength <= 0);

		return massLength;
	}

	public static int getDivider() {
		int massLength = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Please enter a positive value to se up value of a divider: ");
			while (!sc.hasNextInt()) {
				System.out.println("You have entered invalid value! Please try again! ");
				sc.next();
			}
			massLength = sc.nextInt();
		} while (massLength == 0);
		return massLength;
	}

	public static void fillMass(int[] m) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < m.length; i++) {
			System.out.print("mas[" + i + "]=>");
			while (!sc.hasNextInt()) {
				sc.next();
				System.out.print("You have entered an invalid value. Please try again!" + '\n' + "mas[" + i + "]=>");
			}
			m[i] = sc.nextInt();
		}
	}

	public static int takeMassSum(int[] m, int k) {
		int sum = 0;
		for (int i = 0; i < m.length; i++) {
			if (m[i] % k == 0) {
				sum = sum + m[i];
			}
		}
		return sum;
	}

	public static void printResult(int sum) {
		System.out.print("Sum of elements of the massive = " + sum);
	}
}
