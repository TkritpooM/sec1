
public class Date {

	// If Attribute-Name and Parameter-Name == No need to use this. !!!
	
	private int dMonth;
	private int dDay;
	private int dYear;
	
	//Default Constructor
	//The instance variables dMonth,dDay and dYear are set to the dafault variable
	//Postcondition : Month = 1 && Day = 1 && Year = 1900
	public Date() {
		dMonth = 1;
		dDay = 1;
		dYear = 1900;
	}
	
	//Constructor to set the date
	public Date(int month,int day,int year) {
		dMonth = month;
		dDay = day;
		dYear = year;
	}
	
	//Method to set the date
	public void setDate(int month,int day,int year) {
		dMonth = month;
		dDay = day;
		dYear = year;
	}
	
	//Method to return the month
	public int getMonth() {
		return dMonth;
	}
	
	//Method to return the day
	public int getDay() {
		return dDay;
	}
	
	//Method to return the year
	public int getYear() {
		return dYear;
	}
	//Method to return the date in the FOrm mm-dd-yyyy
	public String toString() {
		return getMonth()+"-"+getDay()+"-"+getYear();
	}
	
}
