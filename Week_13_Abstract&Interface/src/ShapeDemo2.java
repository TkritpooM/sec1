import java.util.Scanner;

public class ShapeDemo2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Cylinder[] cylinder = new Cylinder[5];
		for (int i = 0; i < cylinder.length;i++) {
			System.out.print("Input R&H (FORMAT : [Radius Height]) : ");
			String RH = scan.nextLine();
			String[] input = RH.split(" ");
			double radius = Double.parseDouble(input[0]);
			double height = Double.parseDouble(input[1]);
			cylinder[i] = new Cylinder(radius,height);
		}
		
		System.out.println();
		int count = 1;
		for (Cylinder rh : cylinder) {
			System.out.println("Cylinder "+count+", volume = "+rh.getVolume());
			count++;
		}

	}

}
