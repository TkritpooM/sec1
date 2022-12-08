import java.util.*;

public class Lab504 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your name, separated by a space.\n: ");
		String fullname = scan.nextLine();
		String[] namesplit = fullname.split(" "); 
		String firstname = namesplit[0];
		String lastname = namesplit[2];
		
		String midC = abbreviaName(fullname) + ".";
		String lastC = lastname.charAt(0) + ".";
		String name = midC + lastC.toUpperCase() + 
				firstname.toUpperCase().charAt(0) + firstname.substring(1);
		System.out.println(name);
	}

	public static String abbreviaName(String fullname) {
		String m = "";
		for (int i = 0; i < fullname.length() ; i++) {
			if (fullname.charAt(i) == ' ') {
				char mid = fullname.charAt(i+1);
				m = Character.toString(mid).toUpperCase();
				break;
			}
		}
		return m;
	}

}
