package by.cdp.jb27.antonstroich.lesson3;

import java.util.Scanner;

public class MathFunc02 {
	
public static void main (String [] args) {
		
		double x = MathFunc02.getValue();
		double y = MathFunc02.getResult(x);
		MathFunc02.printResult(x,y);	
		}				

    public static double getValue( ) {
    	System.out.print("Enter the value: ");
    	Scanner sc = new Scanner(System.in);
    	double x = 0;
    	while (!sc.hasNextDouble()) {
    		sc.next();
    		System.out.print("You have entered an incorrect value. Please try again: ");
    		
    	}  
    	x = sc.nextDouble();
    	return x;
    }

    public static double getResult (double x) {
    	double y = 0;
    	if (x > 3) {
    		y = MathFunc02.calculateResult(x);
    	}
    	else if (x <= -3) {
    		y = 9;
    	}
    	return y;	
    	} 	 
    
    public static double calculateResult(double x) {
    	double y = 1 / (Math.pow(x, 2) + 1);
    	return y;
    }    
    
    public static void printResult(double x, double y) {
    	if (x > -3 && x <=3) {
    	System.out.println("The function does not have a sulution with this value of an argument: " + x);	
    	}
    	else {
    	System.out.println("x = " + x + " y = " + y);
    	}
    }       
}
