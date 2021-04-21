package firstPackage;
import java.util.*;

public class hicheel3 {
	
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	double subTotal;
	double percent;
	double tips;
	double total;
	
	System.out.println("Enter the subtotal and a gratuity rate: ");
	
	subTotal = input.nextDouble();
	percent = input.nextDouble();
	
	tips = subTotal/100*percent;
	
	total = subTotal + tips;
	
	System.out.println("The gratuity is: " + tips + " and total is: " + total);
	
	
	}
	

}
