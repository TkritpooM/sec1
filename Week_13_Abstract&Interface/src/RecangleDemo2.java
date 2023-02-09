import java.util.*;

public class RecangleDemo2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input width : ");
		double width = scan.nextDouble();
		System.out.print("Input height : ");
		double height = scan.nextDouble();
		
		Rectangle2 rec = new Rectangle2(width,height);
		System.out.println(rec);
		


	}

}
