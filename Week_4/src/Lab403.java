import java.util.*;
public class Lab403 {

public static Scanner scan = new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.print("Message : ");
		String sentence = scan.nextLine();
		sentence = sentence.toLowerCase();
		if (sentence.indexOf("nichi")>=0) {
			System.out.print("Nichi is a sentence ");
		}
		else System.out.print(sentence);
	}

}
