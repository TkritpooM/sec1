/* Inheritance because Class SaveandOpen (extends) Class Employee*/
/* Try/Catch Example */

import java.io.*;
import java.util.*;
public class SaveandOpen extends Employee{
	
	private String name;
	private String dept;
	
	public void insert() throws IOException{
		Scanner console = new Scanner(System.in); //input data from console
		PrintStream prs = new PrintStream(new File("employee.txt")); //write data to file
		String answer;
		do {
			super.header();
			System.out.print("Enter name         : ");
			name = console.next();
			System.out.print("Enter department   : ");
			dept = console.next();
			prs.println(name+"\t"+dept);
			System.out.print("Enter data again ? : ");
			answer = console.next();
		}while(answer.equalsIgnoreCase("y"));
		
	}
	
	public void read() {
		try {
			Scanner in = new Scanner(new File("employee.txt"));
			int i = 0;
			boolean check = false;
			super.header();
			while(in.hasNext()) { // Read File with Scanner : Use only .hasNext()
				name = in.next();
				dept = in.next();
				if (dept.equalsIgnoreCase(super.getDept())) {
					i++;
					System.out.print(i+") "+name);
					check = true;
				}
			} // End of while Loop
            if(check) {
            	super.header();
            	System.out.println("Employee in department "+super.getDept()+" is "+i+" person.");
            }
            else {
            	super.header();
            	System.out.println("Sorry, no department "+super.getDept()+" in file.");
            }
		}catch(IOException e) {
			System.out.print("\nSorry,file not Found . . . ");
		}
	}

}
