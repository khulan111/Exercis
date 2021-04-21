package firstPackage;

import java.util.Scanner;

public class RadiusAndLength {
	public static void main(String[] args) {
		
		double radius;
		double length;
		double area;
		double volume;
		
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the radius and length of a cylinder: ");
		
		radius = input.nextDouble();
		length = input.nextDouble();
		
		
		area = radius * radius * Math.PI;
		volume = area * length;
		
		System.out.println("The area is: " + area + " The volume is: " + volume );
		
		System.out.println("The area is: " + area);
			
		System.out.println("The volume is: " + volume);
		
		
	}

}
