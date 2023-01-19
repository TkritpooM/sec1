import javax.swing.JOptionPane;

public class Example6022 {

	public static void main(String[] args) {
		String[] deptName = {"Accounting","HR","Sales","Innovation"};
		String name = JOptionPane.showInputDialog(null, "Enter a department name");
		boolean departfound = false;
		
		for (int i = 0; i < deptName.length ; i++) {
			if (name.equalsIgnoreCase(deptName[i])) {
				JOptionPane.showMessageDialog(null, name + " was found in the list.");
				departfound = true;
			}
		}
		if (departfound == false) {
			JOptionPane.showMessageDialog(null, name + " was not found in the list.");
		}

	}

}
