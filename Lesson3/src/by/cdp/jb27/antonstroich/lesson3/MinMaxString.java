package by.cdp.jb27.antonstroich.lesson3;

import java.util.Scanner;

public class MinMaxString {
	static String max = "";
	static String min = "";
	static String str = "";

	public static void main(String[] args) {

		MinMaxString.getStrings();
		MinMaxString.printMax(max);
		MinMaxString.printMin(min);
	}

	public static void getStrings() {
		int n = 4;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			System.out.print("> ");
			if (sc.hasNextLine()) {
				str = sc.nextLine();
				if (i == 0) {
					min = str;
				}
				MinMaxString.getMax(str);
				MinMaxString.getMin(str);
			}
		}
	}

	public static String getMax(String str) {
		if (str.length() > max.length()) {
			max = str;
		}
		return max;
	}

	public static String getMin(String str) {
		if (str.length() < min.length()) {
			min = str;
		}
		return min;
	}

	public static void printMax(String max) {

		System.out.println("max string = " + max + " length=" + max.length());

	}

	public static void printMin(String min) {

		System.out.println("min string = " + min + " length=" + min.length());

	}
}