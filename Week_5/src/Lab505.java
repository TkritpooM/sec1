import java.util.*;

public class Lab505 {

	static String studentId;
	static String subjectId;
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		inputStudent();
	}

	static void inputStudent() {

		System.out.print("Input Student ID : ");
		String studentId = scan.nextLine();
		System.out.print("Input Subject ID : ");
		String subjectId = scan.next();
		isLength(studentId, subjectId);

		// isITStudent(studentId);
		// isITSubject(subjectId);

		// isLength(studentId, subjectId);
		// if (isLength(null, 0) == true)

		// isITStudent(studentId);
		// isITsubject(subjectId);

	}

	static boolean isLength(String studentId, String subjectId) {
		if (studentId.length() < 10 || subjectId.length() < 7) {
			if (studentId.length() < 10) {
				while (true) {
					System.out.print("Input Student ID : ");
					studentId = scan.nextLine();
				}
			} else if (subjectId.length() < 7) {
				while (true) {
					System.out.print("Input Subject ID : ");
					subjectId = scan.next();
				}
			}
			return true;
		} else {
			return false;
		}
	}

	/*
	 * static boolean isITStudent (String studentId) { if
	 * (studentId.charAt(2))&&studentId.substring(3,6)) return true; else return
	 * false;
	 * 
	 * }
	 * 
	 * static boolean isITSubject(String subjectId) { if (subjectId.startsWith())
	 * return true; else return false;
	 * 
	 * }
	 * 
	 * static void displayData () { if(){ System.out.print("Student id : "
	 * +studentId+"1st year student in IT and Enroll in courses for year 1"); } }
	 */

}
