package firstPackage;

import java.util.Scanner;

public class ConvertPoundsintoKilo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number in pound: ");
		double pd = 0.454;
		double pound = input.nextDouble();
		double kilo = pound * pd;
		
		System.out.println(pound + " pounds is: " + kilo + " Kilograms");
	

	}

}
