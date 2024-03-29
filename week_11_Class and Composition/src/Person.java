
public class Person {
	
	private String firstName;
	private String lastName;
	
	public Person() {
		firstName = "";
		lastName = "";
	}
	
	public Person(String first,String last) {
		setName(first,last);
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String toString() {
		return firstName+" "+lastName;
	}
	
	//Method to set firstName and lastName with parameter
	public void setName(String first,String last) {
		firstName = first;
		lastName = last;
	}
}
