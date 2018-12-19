package by.cdp.jb7.antonstroich.lesson2;

import java.util.Scanner;

public class MinMaxString {
	public static void main(String[] args) {
		// define variables and initialize scanner
		int n = 10;
		Scanner sc = new Scanner(System.in);
		String max = "", min = "", str = "";
		// run cycle "for" to enter all required strings, 
		// cycle allows inputing of number of rows which is equal to the "n" value.
		// Input sign will be show at the beginning of each row
		for (int i = 0; i < n; i++) {
			System.out.print("> ");
			if (sc.hasNextLine()) {
				str = sc.nextLine();
				// Set up initial min value
				if (i == 0) {
					min = str;
				}
				// compare length of the next row with length of the max variable; 
				//max is empty by default and it will be overwritten by any new string which length more than current.
				if (str.length() > max.length()) { 
					max = str;
				// compare length of the next row with length of the min variable; 
				//min is not empty by default because it was set up at the first loop and it will be overwritten by any new string which length more than current.	
				} else if (str.length() < min.length()) {
					min = str;
				}
			}
		}
		// return values of max and min variables and their length via the length() method
		System.out.println("max string = " + max + " length=" + max.length());
		System.out.println("min string = " + min + " length=" + min.length());
	}
}