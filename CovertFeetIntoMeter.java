package firstPackage;

import java.util.Scanner;

public class CovertFeetIntoMeter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double feet;
		double meter;
		System.out.println("Enter a value for feet: ");
		
		feet = input.nextDouble();
		meter = feet * 0.305;
		
		System.out.println(feet + " feet is: " + meter + " meters");
		

		
	}

}
