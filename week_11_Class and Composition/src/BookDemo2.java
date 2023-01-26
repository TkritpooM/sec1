
import javax.swing.*;

public class BookDemo2 {
	
	public static void main(String[] args) {
		String Aname = JOptionPane.showInputDialog("Input author name : ");
		String Aemail = JOptionPane.showInputDialog("Input author e-mail : ");
		String Btitle = JOptionPane.showInputDialog("Input book title : ");
		int page = Integer.parseInt(JOptionPane.showInputDialog("Input book page : "));
		int result = JOptionPane.showConfirmDialog(null, "Is the page correct ?", "Confirm", JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE);
		if (result == JOptionPane.YES_OPTION) {
			Book book = new Book(Btitle, new Author(Aname, Aemail), page);
			JOptionPane.showMessageDialog(null,"Book Title : " + book.getTitle() + 
					"\nAuthor name : " + book.getAuthor().getName() + 
					"\nAuthor e-mail : " + book.getAuthor().getEmail());
		} else if (result == JOptionPane.NO_OPTION) {
			page = Integer.parseInt(JOptionPane.showInputDialog("Input book page : "));
			Book book = new Book(Btitle, new Author(Aname, Aemail), page);
			JOptionPane.showMessageDialog(null,"Book Title : " + book.getTitle() + 
					"\nAuthor name : " + book.getAuthor().getName() + 
					"\nAuthor e-mail : " + book.getAuthor().getEmail());
		}
	}

}
