package by.cdp.jb27.antonstroich.lesson3;

import java.util.Scanner;

public class LastDigit {
	public static void main(String[] args) {

		int number = LastDigit.enterNumber();

		int poslZifra = LastDigit.getLastDigit(number);

		int poslZifraKv = LastDigit.getSqurtLastDigit(poslZifra);

		if (poslZifraKv == -1) {
			System.out.println("Что-то не то с программой.");
		} else {
			LastDigit.printResult(number, poslZifraKv);
		}
	}

	public static int enterNumber() {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		System.out.print("Введите число: ");
		if (sc.hasNextInt()) {
			number = sc.nextInt();
		}
		return number;
	}

	public static int getLastDigit(int number) {
		int poslZifra = number % 10;
		return poslZifra;
	}

	public static int getSqurtLastDigit(int poslZifra) {
		int poslZifraKv = 3;
		switch (Math.abs(poslZifra)) {
		case 0:
			poslZifraKv = 0;
			break;
		case 1:
			poslZifraKv = 1;
			break;
		case 2:
			poslZifraKv = 4;
			break;
		case 3:
			poslZifraKv = 9;
			break;
		case 4:
			poslZifraKv = 6;
			break;
		case 5:
			poslZifraKv = 5;
			break;
		case 6:
			poslZifraKv = 6;
			break;
		case 7:
			poslZifraKv = 9;
			break;
		case 8:
			poslZifraKv = 4;
			break;
		case 9:
			poslZifraKv = 1;
			break;
		default:
			poslZifraKv = -1;
			System.out.println("Что-то не то с программой.");
		}
		return poslZifraKv;
	}

	public static void printResult(int number, int poslZifraKv) {
		System.out.println("Квадрат числа " + number + " равняется " + poslZifraKv);
	}
}
