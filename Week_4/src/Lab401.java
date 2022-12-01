import java.util.*;
public class Lab401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Full Name : ");
		String inputName = scan.nextLine();
		int foundspace = inputName.indexOf(' ',0);
		if (foundspace == -1) {
			System.out.print("Incorrect Name");
		}
		else {
			String firstname = inputName.substring(0,foundspace);
			String lastname = inputName.substring(foundspace+1);
			System.out.print("First Name : " + firstname.toUpperCase() +
			         "\nLast Name : " + lastname.toLowerCase()   );
		}
	}
}
