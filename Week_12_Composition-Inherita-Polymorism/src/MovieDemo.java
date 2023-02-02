import java.util.Scanner;

public class MovieDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input movie id   : ");
		String Mid = scan.nextLine();
		System.out.print("Input movie name : ");
		String Mname = scan.nextLine();
		
		System.out.println();
		System.out.print("Input director name    : ");
		String Dname = scan.nextLine();
		System.out.print("Input director e-mail  : ");
		String Demail = scan.nextLine();
		System.out.print("Input director gender  : ");
		char Dgender = scan.next().charAt(0);
		while (true) {
			if((Dgender=='m'||Dgender=='M')||(Dgender=='f'||Dgender=='F')) break;
			System.out.print("Input director gender, again : ");
			Dgender = scan.next().charAt(0);
		}
		
		System.out.println();
		System.out.print("Input movie theater no.  : ");
		int Mtheater = scan.nextInt();
		while (Mtheater < 1 || Mtheater > 15) {
			System.out.print("Please input 1 - 15 only : ");
			Mtheater = scan.nextInt();
		}
		
		System.out.println();
		Theater theater = new Theater(Mid,Mname,new Director(Dname,Demail,Dgender),Mtheater);
		System.out.println(theater);
	}

}

/*
Input movie id   : DTM-002
Input movie name : The New Village

Input director name    : Sara Karen
Input director e-mail  : k.sara@gmail.com
Input director gender  : a
Input director gender, again : 1
Input director gender, again : f

Input movie theater no.  : 0
Please input 1 - 15 only : 16
Please input 1 - 15 only : -2
Please input 1 - 15 only : 12

*/