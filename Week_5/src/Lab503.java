import javax.swing.*;

public class Lab503 {

	static int INPUTYEAR;

	public static void main(String[] args) {
		INPUTYEAR = Integer.parseInt(JOptionPane.showInputDialog("Input year : "));
		boolean year = checkYear(INPUTYEAR);
		while (year == false) {
			INPUTYEAR = Integer.parseInt(
					JOptionPane.showInputDialog("Please input year between 1000-3000 : " + "\nInput year, again"));
			year = checkYear(INPUTYEAR);
		}
		boolean leap = isLeapYear(INPUTYEAR);
		JOptionPane.showMessageDialog(null, 
				(leap == true) ?
				INPUTYEAR + " is Leap year." : INPUTYEAR + " is NOT Leap year."
				);
	}

	public static boolean checkYear(int year) {
		if (year >= 1000 && year <= 3000) {
			return true;
		} else {
			return false;
		}
	}

	private static boolean isLeapYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}

}
