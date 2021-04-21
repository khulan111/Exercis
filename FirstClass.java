package firstPackage;

import java.util.Scanner;

public class FirstClass {

	public static void main(String[] args) {
		double a;
		double b;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("number a: ");
		a = input.nextDouble();
		System.out.print("number b: ");
		b = input.nextDouble();
	
		System.out.print("answer: ");
		System.out.println(String.format("%.1f", a + b));
		
		System.out.println(String.format("%.1f", a - b));
		
		System.out.println(String.format("%.1f", a * b));
		
	   
	}

}
