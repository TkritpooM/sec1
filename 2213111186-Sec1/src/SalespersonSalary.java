import java.util.*;
import java.text.*;
public class SalespersonSalary {

	public static void main(String[] args) {
		final double COMMISSION_RATE = 0.15;
		final int SENTINEL = -1;
	    NumberFormat f1 = NumberFormat.getCurrencyInstance();
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter sales in dollars (or -1 to end): ");
		int sales = scan.nextInt();
		do {
			System.out.println("Salary is : " + f1.format( 1000+sales*COMMISSION_RATE ) );
			System.out.println();
			System.out.print("Enter sales in dollars (or -1 to end): ");
			sales = scan.nextInt();
			if (sales == -1) {
				System.out.print("bye");
				break;
			}
		}while (sales != SENTINEL);
	}
}
