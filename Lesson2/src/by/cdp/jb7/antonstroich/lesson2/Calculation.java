package by.cdp.jb7.antonstroich.lesson2;

import java.util.Scanner;

public class Calculation {

	public static void main(String[] args) {

		double a;

		double b;

		double c;

		double fx;

		System.out.print("Please enter a value of a variable: ");

		a = Calculation.getValue();
		if (a <= 0) {
			System.out.print("You have entered invalid value. It must be higher that zero. Please retry!");
			return;
		}

		System.out.print("Please enter a value of a variable: ");
		b = Calculation.getValue();

		System.out.print("Please enter a value of a variable: ");
		c = Calculation.getValue();

		fx = Calculation.getResult(a, b, c);
		System.out.print("fx = " + fx);

	}

	public static double getValue() {
		Scanner sc = new Scanner(System.in);
		double x;
		while (!sc.hasNextDouble()) {
			sc.next();
		}
		x = sc.nextDouble();
		return x;
	}

	public static double getResult(double a, double b, double c) {
		double y;
		y = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a - Math.pow(a, 3) * c + b;
		return y;
	}
}
