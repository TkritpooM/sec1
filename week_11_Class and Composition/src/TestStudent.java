
public class TestStudent {

	public static void main(String[] args) {

		// Test constructor and toString()
		Student anupap = new Student("Anupap Jaising", "I Happy Ave");
		System.out.println(anupap); // toString()

		System.out.println();
		// Test Setters and Getters
		anupap.setAddress("25 Pattanakarn");
		System.out.println(anupap); // toString()
		System.out.println(anupap.getName());
		System.out.println(anupap.getAddress());

		System.out.println();
		// Test addCourse(),printGrades() and getAverageGrades()
		anupap.addCourseGrade("INT107", 87);
		anupap.addCourseGrade("INT108", 81);
		anupap.addCourseGrade("MSC-202", 92);
		anupap.printGrades();

		System.out.printf("The average grade is %.3f%n", anupap.getAverage());

	}

}
