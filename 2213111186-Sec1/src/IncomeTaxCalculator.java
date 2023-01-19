import java.util.*;
import java.text.*;
public class IncomeTaxCalculator {
	public static DecimalFormat f1 = new DecimalFormat("####.0");
	public static NumberFormat f2 = NumberFormat.getCurrencyInstance();
	public static Scanner scan = new Scanner (System.in);
	public static final double TAX_RATE_ABOVE_20K = 0.1;	
	public static final double TAX_RATE_ABOVE_40K = 0.2;
	public static final double TAX_RATE_ABOVE_60K = 0.3;
	public static void main(String[] args) {
			// Declare variables
			System.out.print("Enter the taxable income: ");
			int taxableIncome = scan.nextInt();
			double taxPayable;
			if (taxableIncome <= 20000) { 
				taxPayable = (taxableIncome*0.00);
				System.out.print("The income tax payable is: " + f2.format(taxPayable));
			} 
			else if (taxableIncome <= 40000) {
				taxPayable = ((taxableIncome*0.00) + ((taxableIncome-20000)*TAX_RATE_ABOVE_20K));		
				System.out.print("The income tax payable is: " + f2.format(taxPayable));
			} 
			else if (taxableIncome <= 60000) {
				taxPayable = ((taxableIncome*0.00) + (20000*TAX_RATE_ABOVE_20K) +((taxableIncome-40000)*TAX_RATE_ABOVE_40K));
				System.out.print("The income tax payable is: " + f2.format(taxPayable));
			} 
			else { 
				taxPayable = (((taxableIncome*0.00) + (20000*TAX_RATE_ABOVE_20K) +(20000*TAX_RATE_ABOVE_40K)+((taxableIncome-60000)*TAX_RATE_ABOVE_60K)));
				System.out.print("The income tax payable is: " + f2.format(taxPayable));
			}

	}

}


