import java.util.*;

public class Lab505 {

	static String studentId;
	static String subjectId;
	static Scanner scan = new Scanner (System.in);
	
	
	public static void main(String[] args) {
		inputStudent();
	}
	static void inputStudent () {
		while (true) {
			System.out.print("Input Student ID : ");
		    String studentId = scan.nextLine();
		    System.out.print("Input Subject ID : ");
		    String subjectId = scan.nextLine();
		    boolean check = isLength(studentId,subjectId);
		    if (check == true) break;
		}
		boolean checkisITStudent = isITStudent(studentId);
		boolean checkisITsubject = isITsubject(subjectId);
		displayData(checkisITStudent,checkisITsubject);
		
	}
	static boolean isLength(String studentId,String subjectId) {
		if (studentId.length() == 10 &&  subjectId.length() == 7) return true;
		else return false;
		
	}
	static boolean isITStudent (String studentId) {
		if (studentId.substring(2, 6).equals("1311")) return true;
		else return false;
		
	}
	static boolean isITsubject (String subjectId) {
		if (subjectId.substring(0,2).equals("21") && subjectId.substring(4).equals("1")) return true;
		else return false;
		
	}
	static void displayData (boolean checkisITStudent, boolean checkisITsubject) {
		if(checkisITStudent == true && checkisITsubject == true){
			System.out.print("Student id : "+studentId+"1st year student in IT and Enroll in courses for year 1");
		}
		else if ((checkisITStudent == true && checkisITsubject == false)) {
			System.out.print("Student id : "+studentId+"1st year student in IT not Enroll in courses for year 1");
		}
		else if ((checkisITStudent == false && checkisITsubject == true)) {
			System.out.print("Student id : "+studentId+"is not 1st year student in IT Enroll in courses for year 1");
		}
		else System.out.print("Student id : "+studentId+"is not 1st year student in IT not Enroll in courses for year 1");
	}

}
