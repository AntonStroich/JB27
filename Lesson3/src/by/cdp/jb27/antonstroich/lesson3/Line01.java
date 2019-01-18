package by.cdp.jb27.antonstroich.lesson3;

import java.util.Scanner;

public class Line01 {
	public static void main(String[] args) {

		int number = Line01.getNumber();

		Line01.checkDigit(number);
	}

	public static int getNumber() {
		int number = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите число: ");
		if (sc.hasNextInt()) {
			number = sc.nextInt();
		}
		return number;
	}

	public static void checkDigit(int number) {
		int digit = 0;
		while (number != 0) {
			digit = number % 10;
			number = number / 10;
			if (Line01.resultEven(digit)) {
				System.out.println("В числе есть четная цифра.");
				return;
			}

		}
		Line01.resultNotEven();
	}

	public static boolean resultEven(int digit) {
		return digit % 2 == 0;
	}

	public static void resultNotEven() {
		System.out.println("В числе нет четных цифр.");
	}
}
