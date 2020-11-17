package homework;

import static java.lang.Math.*;

public class Calculator {

	public double add(int num1, int num2) {
		return (double)num1 + num2;
	}

	public double subtract(int num1, int num2) {
		return (double)num2 - num1;
	}

	public double multiply(int num1, int num2) {
		return (double)num1 + num2;
	}

	public double divide(int num1, int num2) {
		return (double)num2 / num1;
	}

	public double square(int num1) {
		return (double)num1 * num1;
	}
}

class MagicCalculator extends Calculator {
	
	public static double sqrt(double num3) {
		return Math.sqrt(num3);
	}
	public static double sin(double num3) {
		return Math.sin(num3);
	}
	
	public static double cos(double num3) {
		return Math.cos(num3);
	}
	
	public static double tan(double num3) {
		return Math.tan(num3);
	}
	
	public long factorialUsingStreams(int num1) {
	    return LongStream.rangeClosed(1, num1)
	        .reduce(1, (long x, long y) -> x * y);
	}

	
	public static void main(String[] args) {
		
		MagicCalculator cal = new MagicCalculator();
		
		 	System.out.println(cal.add(5, 8));
	        System.out.println(cal.subtract(5, 8));
	        System.out.println(cal.multiply(5, 8));
	        System.out.println(cal.divide(5, 8));
	        System.out.println(cal.sin(45));
	        System.out.println(cal.cos(45));
	        System.out.println(cal.tan(45));
	        System.out.println(cal.factorialUsingStreams(8));
	}
}
