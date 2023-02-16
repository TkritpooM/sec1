
/* Read file with Scanner */
import java.util.*;
import java.io.*;

public class Example1201 {

	public static void main(String[] args) throws IOException {
		try {
			Scanner read = new Scanner(new File("MemberLogin.txt"));
			while (read.hasNext()) {
				String fname = read.next();
				String lname = read.next();
				read.next();
				String email = read.next().toUpperCase();
				System.out.println(fname + " (" + email + ")");
			}
			read.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
