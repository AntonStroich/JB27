package by.cdp.jb7.antonstroich.lesson2;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {

		double r;

		double l;

		double s;

		System.out.print("Please enter a value of a radius of the circle: ");
		r = Circle.getRadius();

		if (r <= 0) {
			System.out.print("You have entered invalid value of radius. It must be higher that zero. Please retry!");
			r = Double.NaN;
		} else {

			l = Circle.getLength(r);
			System.out.print("Length of the Circle = " + l + '\n');

			s = Circle.getSquare(r);
			System.out.print("Square of the Cicle = " + s + '\n');
		}
	}

	public static double getRadius() {
		Scanner sc = new Scanner(System.in);
		double r;
		while (!sc.hasNextDouble()) {
			sc.next();
		}
		r = sc.nextDouble();
		return r;
	}

	public static double getLength(double r) {
		double l = 2 * Math.PI * r;
		return l;
	}

	public static double getSquare(double r) {
		double s = Math.pow(r, 2) * Math.PI;
		return s;
	}
}
