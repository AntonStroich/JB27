package by.cdp.jb27.antonstroich.lesson3;
import java.util.Scanner;

public class MathFunc {
	
	public static void main (String [] args) {
		
		double a = MathFunc.getValue();
		double b = MathFunc.getValue();
		if (a <= b) {
			double h = MathFunc.getValue();
			if (h > 0) {
			MathFunc.printResult(a, b, h);
			}
			else {
				System.out.println("The third value should be more than 0");
			}
		}
		else {
			System.out.println("The second value should be more or equal to the first one");
		}				
	}

    public static double getValue( ) {
    	System.out.print("Enter the value: ");
    	Scanner sc = new Scanner(System.in);
    	double c = 0;
    	while (!sc.hasNextDouble()) {
    		sc.next();
    		System.out.print("You have entered an incorrect value. Please try again: ");
    		
    	}  
    	c = sc.nextDouble();
    	return c;
    }

    public static void printResult (double a, double b, double h) {
    	for (double x = a;  x <= b; x+=h) {  
    		double y = MathFunc.getResult(x);
    		System.out.println("x = " + x + " y = " + y);
    	}
    	 
    }
    
    public static double getResult(double x) {
    	double y = 2 * Math.tan(x / 2) + 1;
    	return y;
    }    
}
