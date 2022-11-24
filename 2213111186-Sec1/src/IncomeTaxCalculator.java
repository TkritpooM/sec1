import java.util.*;
import java.text.*;
public class IncomeTaxCalculator {

	public static void main(String[] args) {
		DecimalFormat f1 = new DecimalFormat("####.0");
		NumberFormat f2 = NumberFormat.getCurrencyInstance();
		Scanner scan = new Scanner (System.in);
		
		// Declare constants first (variables may use these constants)
		final double TAX_RATE_ABOVE_20K = 0.1;
		final double TAX_RATE_ABOVE_40K = 0.2;
		final double TAX_RATE_ABOVE_60K = 0.3;
		// Declare variables
		System.out.print("Enter the taxable income: ");
		int taxableIncome = scan.nextInt();
		double taxPayable;
		if (taxableIncome <= 20000) { // [0, 20000]
			taxPayable = (taxableIncome*0.00);
			System.out.print("The income tax payable is: " + f2.format(taxPayable));
		} 
		else if (taxableIncome <= 40000) { // [20001, 40000]
			taxPayable = ( taxableIncome -
					((taxableIncome/2)*0.00) + ((taxableIncome/2)*TAX_RATE_ABOVE_20K)
					);
			System.out.print("The income tax payable is: " + f2.format(taxPayable));
		} 
		else if (taxableIncome <= 60000) { // [40001, 60000]
			taxPayable = ((taxableIncome/2)*0.00) + ((taxableIncome/2)*TAX_RATE_ABOVE_20K) +
					((taxableIncome/2)*TAX_RATE_ABOVE_40K);
			System.out.print("The income tax payable is: " + f2.format(taxPayable));
		} 
		else { 
			taxPayable = ( 
					        taxableIncome - (
						    ((taxableIncome/2)*0.00) + 
							((taxableIncome/2)*TAX_RATE_ABOVE_20K) +
					        ((taxableIncome/2)*TAX_RATE_ABOVE_40K)
					        )
					     ) * TAX_RATE_ABOVE_60K;
			System.out.print("The income tax payable is: " + f2.format(taxPayable));
		}

	}

}
