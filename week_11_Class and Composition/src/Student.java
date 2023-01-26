
public class Student {

	// private instance variables
	private String name;
	private String address;
	// The course taken and grade for the courses are kept in 2 parallel arrays
	private String courses[];
	private int grades[]; // valid range is [0,100]
	private int numCourses; // number of courses taken so far
	// Maximum number of courses taken by student
	private static final int MAX_COURSE = 30;

	// Constructs a Student instance with give input
	public Student(String name, String address) {
		this.name = name;
		this.address = address;
		courses = new String[MAX_COURSE];
		grades = new int[MAX_COURSE];
		numCourses = 0;
	}

	public String getName() {
		return this.name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
		return name + "(" + address + ")";
	}

	// Add a Courses and Grade
	public void addCourseGrade(String course, int grade) {
		courses[numCourses] = course;
		grades[numCourses] = grade;
		++numCourses;
	}

	// Prints all courses and their grade
	public void printGrades() {
		System.out.print(name);
		for (int i = 0; i < numCourses; i++) {
			System.out.print(" " + courses[i] + ":" + grades[i]);
		}
		System.out.println();
	}

	// Computes the average
	public double getAverage() {
		int sum = 0;
		for (int _grades : grades) {
			sum += _grades;
		}
		return (double) sum / numCourses;
	}

}
