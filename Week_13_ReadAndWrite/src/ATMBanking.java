import java.util.*;
import java.io.*;

public class ATMBanking {

	public static void main(String[] args) throws IOException{
		
		Scanner console = new Scanner(System.in);
		
		boolean check = true;
		System.out.print("Enter account number : ");
		String acc = console.next();
		for (char c : acc.toCharArray()) {
			if (!(Character.isDigit(c))) check=false;
		}
		while(!(acc.charAt(1)=='-'&&acc.charAt(5)=='-'&&acc.charAt(9)=='-'&&acc.charAt(12)=='-')&&
				(check == false)) {
			System.out.print("Input wrong type, Enter account number : ");
			acc = console.next();
		}
		
		check = true;
		System.out.print("Enter password : ");
		String pass = console.next();
		for (char c : pass.toCharArray()) {
			if (!(Character.isDigit(c))) check=false;
		}
		while ((pass.length() > 4 || pass.length() < 4)) {
			System.out.print("Enter password : ");
			pass = console.next();
		}
		
		System.out.print("Enter money : ");
		int money = console.nextInt();
		
		System.out.println();
		ATMChecking bank = new ATMChecking(acc,pass,money);
		boolean checkA = bank.checkBookBank();
		bank.show();

	}
}
//&&(check==false)  1-523-745-67-8