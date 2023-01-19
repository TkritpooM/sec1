import javax.swing.*; //JOptionPane
import java.util.*; //Console
public class Example_403 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Console
		Scanner scan = new Scanner (System.in);
	    System.out.print("Input a sentence : ");
	    String sentence = scan.nextLine();
	    while (!sentence.endsWith(".")) { //while(true)
	    	System.out.print("Input a sentence, again : ");
	    	sentence = scan.nextLine();
	    }
	    System.out.println();
	    int countspace = 0;
	    for (int i = 0 ; i < sentence.length() ; i++) {
	    	if (sentence.charAt(i) == ' ') {
	    		countspace++;
	    	}
	    }
	    
	    System.out.print("This sentence has " + countspace + "spacebar." +
	    		         "\nThis sentence has " + (countspace+1) + "word.");
	    
		
		/*
		//Dialogbox
		String sentence = JOptionPane.showInputDialog("Input a sentence : ");
		while (!sentence.endsWith(".")) {
			sentence = JOptionPane.showInputDialog("Input a sentence, again : ");
		}
		int countspace = 0;
		for (int i = 0 ; i < sentence.length() ; i++) {
	    	if (sentence.charAt(i) == ' ') {
	    		countspace++;
	    	}
	    }
		JOptionPane.showMessageDialog(null, 
				"\n\nThis sentence has " + countspace + "spacebar." +
	    		"\nThis sentence has " + (countspace+1) + "word."
				);
		*/

	}

}
