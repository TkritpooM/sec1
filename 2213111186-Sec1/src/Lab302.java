import javax.swing.JOptionPane;
import java.text.*;
public class Lab302 {

	public static void main(String[] args) {
		DecimalFormat f1 = new DecimalFormat("###.#");
		double weight = Double.parseDouble(
				JOptionPane.showInputDialog("Input Weight : "));
		double height = Integer.parseInt(
				JOptionPane.showInputDialog("Input Height : "));
		height /= 100;
		double bmi = (weight / (height * height));
		if (bmi <= 18.5) {
			JOptionPane.showMessageDialog(null, 
					"BMI = " + f1.format(bmi) + "\nYou're Underweight",
					"BMI",
					JOptionPane.WARNING_MESSAGE
					);
		}
		else if (bmi >= 18.5 && bmi <= 24.9) {
			JOptionPane.showMessageDialog(null, 
					"BMI = " + f1.format(bmi) + "\nYou're Normal-weight",
					"BMI",
					JOptionPane.WARNING_MESSAGE
					);
		}
		else if (bmi >= 25.0 && bmi <= 29.9) {
			JOptionPane.showMessageDialog(null, 
					"BMI = " + f1.format(bmi) + "\nYou're Overweight",
					"BMI",
					JOptionPane.WARNING_MESSAGE
					);
		}
		else if (bmi >= 30) {
			JOptionPane.showMessageDialog(null, 
					"BMI = " + f1.format(bmi) + "\nYou're Obesity",
					"BMI",
					JOptionPane.WARNING_MESSAGE
					);
		}
	}

}
