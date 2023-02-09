

public class FictionBook implements Author,Book{

	private String author_name;
	private String email;
	private String title;
	private int publicYear;
	
	public FictionBook(String title,int publicYear) {
		this.title = title;
		this.publicYear = publicYear;
	}
	
	public void setAuthorName(String name) {
		author_name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean checkFormatName() {
		
	}
	
	@Override
	public String getFirstName() {
		return author_name.substring(0,' ');
	}
	
	@Override
	public String getLastName() {
		return author_name.substring(' '+1);
	}
	
	@Override
	public int totalPublicYear() {
		return 2023-publicYear;
	}
	
	
	@Override
	public boolean checkEmail() {
		
	}
	
	public String toString() {
		return title+" write by "+getFirstName().charAt(0)+"."+getLastName()+" ("+email+")\n"+
	    "Published for "+(new Date().getYear()-publicYear)+" years.";
	}
	
}
