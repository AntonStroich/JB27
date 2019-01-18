package by.cdp.jb7.antonstroich.lesson1;

public class Triangle {

	public static void main(String[] args) {

		double a;

		double b;

		double c;

		double s;

		a = 3;

		b = 4;

		c = Math.sqrt(a * a + b * b);
		System.out.println("Гипотенуза = " + c);

		s = 0.5 * a * b;
		System.out.println("Площадь = " + s);

	}

}
