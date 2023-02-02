import javax.swing.JOptionPane;

public class TestInformation {

	public static void main(String[] args) {
		
		String Dname = JOptionPane.showInputDialog("Input Director name : ");
		String Demail = JOptionPane.showInputDialog("Input Director e-mail : ");
		String Mtitle = JOptionPane.showInputDialog("Input Movie title : ");
		int confirmE = JOptionPane.showConfirmDialog(null, 
				"Do you confirm your e-mail ?", "Confirm", 
				JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
		if (confirmE == 1) {
			Demail = JOptionPane.showInputDialog("Input Director e-mail : ");
			Director author = new Director(Dname,Demail);
		}
		Director author = new Director(Dname,Demail);
		JOptionPane.showMessageDialog(null,"Movie Title : " + Mtitle + 
				"\nDirector name : " + author.getName() + 
				"\nDirector e-mail : " + author.getEmail());
		
	}
}

/* 
 * 1) Sara Haren / sara@gmail.com / The New Village
 * 2) Sara Haren / sara@gmail.com / The New Village / Change email --> h.sara@hotmail.com
 */