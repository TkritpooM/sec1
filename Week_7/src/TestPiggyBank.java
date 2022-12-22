import java.util.*;

public class TestPiggyBank {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		PiggyBank pb = new PiggyBank();

		System.out.println("Money Total : " + pb.getTotal());
		System.out.print("Please difine size of PiggyBank : ");
		pb.setPiggyBank(scan.nextInt());
		System.out.println("Size of your PiggyBank : " + pb.getPiggyBank());
		System.out.println();

		Menu();
		System.out.print("Please Select Menu[1-5] : ");
		int choice = scan.nextInt();
		while (choice < 6) {
			if (choice == 1) {
				System.out.print("Insert 1 Baht Money : ");
				pb.addOne(scan.nextInt());
				System.out.println("Money Total : " + pb.getTotal());
			} else if (choice == 2) {
				System.out.print("Insert 2 Baht Money : ");
				pb.addTwo(scan.nextInt());
				System.out.println("Money Total : " + pb.getTotal());
			} else if (choice == 3) {
				System.out.print("Insert 5 Baht Money : ");
				pb.addFive(scan.nextInt());
				System.out.print("Money Total : " + pb.getTotal());
			} else if (choice == 4) {
				System.out.println("Insert 10 Baht Money : ");
				pb.addTen(scan.nextInt());
				System.out.print("Money Total : " + pb.getTotal());
			} else if (choice == 5) {
				System.out.println("Bye Bye");
				break;
			}
			
			System.out.println();
			Menu();
			System.out.print("Please Select Menu[1-5] : ");
			choice = scan.nextInt();
		}
	}

	public static void Menu() {
		Line();
		System.out.println("Menu of PiggyBank");
		Line();
		System.out.println("[1] one baht.");
		System.out.println("[2] two baht.");
		System.out.println("[3] five baht.");
		System.out.println("[4] ten baht.");
		System.out.println("[5] Exit");
		Line();
	}

	public static void Line() {
		System.out.println("==================================");
	}

}
