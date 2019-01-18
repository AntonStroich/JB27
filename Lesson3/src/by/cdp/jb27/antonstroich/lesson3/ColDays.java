package by.cdp.jb27.antonstroich.lesson3;

import java.util.Scanner;

public class ColDays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int year = ColDays.getYear();

		int month = ColDays.getMonth();

		int col_day = ColDays.getDays(year, month);

		ColDays.printResult(col_day);
	}

	public static int getYear() {
		Scanner sc = new Scanner(System.in);
		int year = 0;
		System.out.print("Введите год: ");
		if (sc.hasNextInt()) {
			year = sc.nextInt();
		}
		return year;
	}

	public static int getMonth() {
		Scanner sc = new Scanner(System.in);
		int month = 0;
		System.out.print("Введите номер месяца: ");
		if (sc.hasNextInt()) {
			month = sc.nextInt();
		}
		return month;
	}

	public static int getDays(int year, int month) {
		int col_day = 0;
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			col_day = 31;
			break;
		case 2:
			if (year % 4 == 0) {
				col_day = 29;
			} else {
				col_day = 28;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			col_day = 30;
			break;
		}
		return col_day;
	}

	public static void printResult(int col_day) {
		System.out.println("Количество дней равно - " + col_day);
	}

}
