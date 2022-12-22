import java.util.*;

public class StudentScore {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("How many student in classroom : ");
		int studentN = scan.nextInt();
		System.out.println();
		
		Student[] std = new Student[studentN];
		
		for (int i = 0; i< std.length ; i++) {
			std[i] = new Student();
			System.out.println("INPUT INFORMATION OF STUDENT " + (i+1));
			System.out.println("--------------------------------------------");
			System.out.print("Input student name : ");
			std[i].setName(scan.next());
			System.out.print("Input student score : ");
			std[i].setScore(scan.nextInt());
			while (  !(std[i].checkScore())  ) {
				System.out.print("Input student score, again : ");
				std[i].setScore(scan.nextInt());
			}
			System.out.println();
		}
		
		System.out.println("LIST OF PASS STUDENT (>= 50) : ");
		System.out.println("--------------------------------------------");
		
		/*
		for (int i = 0; i < std.length ; i++) {
			if (std[i].isPass()) {
				System.out.println(">> " + std[i].getName() + " (" + std[i].getScore() + ")");
			}
		}
		*/
		
		for (int i = 0; i < std.length ; i++) {
			if (std[i].isPass()) {
				System.out.println(">> " + std[i].getName() + " get grade " + 
			                       findGrade(std[i].getScore()));
			}
		}
	}

	public static String findGrade(int score) {
		if (score >= 80 && score <= 100) {
			return "A";
		} else if (score >= 75 && score <= 79) {
			return "B+";
		} else if (score >= 70 && score <= 74) {
			return "B";
		} else if (score >= 65 && score <= 69) {
			return "C+";
		} else if (score >= 60 && score <= 64) {
			return "C";
		} else if (score >= 55 && score <= 59) {
			return "D+";
		} else if (score >= 50 && score <= 50) {
			return "D";
		} 
		return "F";
	}

}
