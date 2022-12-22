import java.util.Scanner;

public class CheckStockProduct {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("How many product list in stock : ");
		int list = scan.nextInt();
		Product productlist[] = new Product[list];
		System.out.println();
		
		for (int i = 0 ; i < productlist.length; i++) {
			productlist[i] = new Product();
			System.out.print("Input product Id     : ");
			productlist[i].setId(scan.next());
			System.out.print("Input product Unit   : ");
			productlist[i].setUnit(scan.nextInt());
			System.out.println();
		}
		
		/*
		for (int i = 0 ; i< productlist.length ; i++) {
			if (productlist[i].getUnit() < 5) {
				display("Low",productlist[i].getId(),productlist[i].getUnit());
			}
            if (productlist[i].getUnit() >= 5 && productlist[i].getUnit() < 50) {
            	display("NORMAL",productlist[i].getId(),productlist[i].getUnit());
			}
            if (productlist[i].getUnit() >=  50) {
            	display("HIGH",productlist[i].getId(),productlist[i].getUnit());
            }
		}
		*/
		
		System.out.println("------------------------------------");
		System.out.println("List of product in 'low' status.");
		System.out.println("------------------------------------");
		for (int i = 0 ; i< productlist.length ; i++) {
			if (productlist[i].getUnit() < 5) {
				System.out.println(">> " + productlist[i].getId() + " has " + productlist[i].getUnit() + " units");
			}
		}
		
		System.out.println("------------------------------------");
		System.out.println("List of product in 'NORMMAL' status.");
		System.out.println("------------------------------------");
		for (int i = 0 ; i< productlist.length ; i++) {
			if (productlist[i].getUnit() >= 5 && productlist[i].getUnit() < 50) {
				System.out.println(">> " + productlist[i].getId() + " has " + productlist[i].getUnit() + " units");
			}
		}
		
		System.out.println("------------------------------------");
		System.out.println("List of product in 'HIGH' status.");
		System.out.println("------------------------------------");
		for (int i = 0 ; i< productlist.length ; i++) {
			if (productlist[i].getUnit() >=  50) {
				System.out.println(">> " + productlist[i].getId() + " has " + productlist[i].getUnit() + " units");
			}
		}
	}
	
	/*
	public static void display(String status,String name,int unit) {
		System.out.println("------------------------------------");
		System.out.println("List of product in '" + status + "' status.");
		System.out.println("------------------------------------");
		System.out.println(">> " + name + "has " + unit + " units");
	}
	*/

}
