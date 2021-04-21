package firstPackage;

import java.util.Scanner;

public class CovertCeliusToFahrenheit {


	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
				double c;
				double f;
				
				System.out.print("Enter a degree in Celsius: ");
		
		c = input.nextDouble();
		f = (9.0/5) * c + 32;
		
		System.out.println("Fahrenheit is: " + f);
		
	}
}
