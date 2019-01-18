package by.cdp.jb27.antonstroich.lesson4;

import java.util.Scanner;

import java.util.Arrays;

public class Mass03 {

	public static void main(String[] args) {
		int firstArray[] = new int[8];

		Mass03.fillFirstArray(firstArray);

		int countZero = Mass03.checkFirstArray(firstArray);

		int secondArray[] = new int[countZero];

		Mass03.fillSecondArray(firstArray, secondArray);

		Mass03.printSecondArray(secondArray);

	}

	public static void fillFirstArray(int firstArray[]) {
		for (int i = 0; i < firstArray.length; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.print("firstArray[" + i + "] =>");
			while (!sc.hasNextInt()) {
				System.out.print(
						"You have entered an incorrect value! Please, try again!" + '\n' + "firstArray[" + i + "] =>");
				sc.next();
			}
			firstArray[i] = sc.nextInt();

		}
	}

	public static int checkFirstArray(int firstArray[]) {
		int countZero = 0;
		for (int i = 0; i < firstArray.length; i++) {
			if (firstArray[i] == 0) {
				countZero++;
			}
		}
		return countZero;
	}

	public static void fillSecondArray(int firstArray[], int secondArray[]) {
		int count = 0;
		for (int i = 0; i < firstArray.length; i++) {
			if (firstArray[i] == 0) {
				secondArray[count] = i;
				count++;
			}
		}
	}

	public static void printSecondArray(int secondArray[]) {
		if (secondArray.length == 0) {
			System.out.print("The second array has not been filled in because the first array does not have any 0!");
		} else {
			System.out.println("Values of the following cells of the first array = 0: " + Arrays.toString(secondArray));
		}
	}

}
