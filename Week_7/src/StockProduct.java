import java.util.*;
import java.text.*;

public class StockProduct {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		DecimalFormat nf = new DecimalFormat("#,###.0");
		Product productlist[] = new Product[4];
		
		for (int i = 0 ; i < productlist.length; i++) {
			productlist[i] = new Product();
			System.out.print("Input product Id     : ");
			productlist[i].setId(scan.next());
			System.out.print("Input product Unit   : ");
			productlist[i].setUnit(scan.nextInt());
			System.out.print("Input product Price  : ");
			productlist[i].setPrice(scan.nextDouble());
			System.out.println();
		}
		
		System.out.println("-----------------------------------------------");
		
		for (int i = 0; i<4 ; i++) {
			System.out.println("Product ID : " + productlist[i].getId() + 
					           ", Total price = " + 
					           nf.format((productlist[i].getPrice() * productlist[i].getUnit())) + 
					           " baht.");
		}
		System.out.println("-----------------------------------------------");
		double sum = (productlist[0].getPrice()*productlist[0].getUnit()) + 
				     (productlist[1].getPrice()*productlist[1].getUnit()) +
				     (productlist[2].getPrice()*productlist[2].getUnit()) +
				     (productlist[3].getPrice()*productlist[3].getUnit());
		System.out.println("Total price of all products is " + nf.format(sum) + " baht.");
	}
}
