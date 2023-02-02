/* INHERITANCE Concept */

import javax.swing.JOptionPane;

public class Shop100Baht {

	public static void main(String[] args) {

		Product sold = new Product();

		/* YES/NO dialog box */
		/* button == 0 --> Yes || button == 1 --> No */
		int button = JOptionPane.showConfirmDialog(null, 
				"Is the program run on Pattanakarn Branch ?", "Confirm",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

		/* Input Integer in Dialog box */
		if (button == 0) {
			sold = new PattanakarnBranch();
			sold.setUnit(Integer.parseInt(JOptionPane.showInputDialog("Input the number of product : ")));
			JOptionPane.showMessageDialog(null, sold);
		}
		sold.setUnit(Integer.parseInt(JOptionPane.showInputDialog("Input the number of product : ")));
		JOptionPane.showMessageDialog(null, "You buy 8 units (" + sold.getTotalprice() + ")");

	}
}
