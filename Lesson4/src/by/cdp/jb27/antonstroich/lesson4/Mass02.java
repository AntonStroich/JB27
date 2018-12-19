package by.cdp.jb27.antonstroich.lesson4;

import java.util.Scanner;

public class Mass02 {

	public static void main(String[] args) {
		int arrayLenght = Mass02.inputArrayLength();
		double[] array = new double[arrayLenght];
		Mass02.fillArray(array);
		boolean checkArrayResult = Mass02.checkArray(array);
		Mass02.printResult(checkArrayResult);
	}

	public static int inputArrayLength() {
		int arrayLength = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Please enter a positive value to se up the massive length: ");
			while (!sc.hasNextInt()) {
				System.out.println("You have entered invalid value! Please try again! ");
				sc.next();
			}
			arrayLength = sc.nextInt();
		} while (arrayLength <= 0);
		return arrayLength;
	}

	public static void fillArray(double[] array) {

		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			
			while (!scan.hasNextDouble()) {
				scan.next();
				System.out.print("You have entered an invalid value. Please try again!" + '\n' + "array[" + i + "]=>");
			}
			array[i] = scan.nextDouble();
		}
	}

	public static boolean checkArray(double[] array) {
		boolean checkArrayResult = false;
		for (int i = 1; i < array.length; i++) {
			double value = array[0];
			if (array[i] > value) {
				value = array[i];
				checkArrayResult = true;
			} else {
				checkArrayResult = false;
				break;
			}
		}
		return checkArrayResult;
	}

	public static void printResult(boolean checkArrayResult) {
		if (checkArrayResult == true) {
			System.out.println("The sequence of numbers is increasing!");
		} else {
			System.out.println("The sequence of numbers is NOT increasing!");
		}
	}

}
