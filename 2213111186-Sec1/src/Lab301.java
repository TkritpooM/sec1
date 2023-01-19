import javax.swing.JOptionPane;
import java.text.*;
public class Lab301 {

	static int BUFFET = 299;
	static final int DISCOUNTCARD = 10;
	public static void main(String[] args) {
		int bill = Integer.parseInt(
				JOptionPane.showInputDialog("How many customer per bill ? : "));
		int member = JOptionPane.showConfirmDialog(null,
				"Total Price is " + (BUFFET*bill) + " baht." + 
		        "\nDo you have a member card ? ");
		do {
			member = JOptionPane.showConfirmDialog(null,
					"Total Price is " + (BUFFET*bill) + "baht." + 
			        "\nDo you have a member card ? ");
		}while (member == 2);
		if (member == 0) {
			JOptionPane.showMessageDialog(null, 
					"Amount to be paid is " + 
			        ( (BUFFET*bill)-(((BUFFET*bill)*DISCOUNTCARD)/100)) +
			        " baht."
					);
		}
		else if (member == 1) {
			JOptionPane.showMessageDialog(null, 
					"Amount to be paid is " + 
			        ( (BUFFET*bill) ) +
			        " baht."
					);
		}
		
	}

}

//conditional operator ((gender == 0) ? "female" : "Male")
// 2 8 10