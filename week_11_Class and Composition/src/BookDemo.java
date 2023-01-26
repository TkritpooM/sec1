import java.util.Scanner;

public class BookDemo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Input author name   : ");
		String Aname = scan.nextLine();
		System.out.print("Input author e-mail : ");
		String Aemail = scan.nextLine();
 
		System.out.println();
		System.out.print("Input book title : ");
		String title = scan.nextLine();
		System.out.print("Input book page  : ");
		int page = scan.nextInt();
		
		System.out.println();
		Author Lee = new Author(Aname,Aemail);
		Book book = new Book(title,Lee,page);
		System.out.print(book);

	}

}