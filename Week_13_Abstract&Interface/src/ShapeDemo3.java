import javax.swing.*;

public class ShapeDemo3 {

	public static void main(String[] args) {
		
		Cylinder[] cylinder = new Cylinder[5];
		for (int i = 0; i < cylinder.length;i++) {
			double radius = Double.parseDouble(JOptionPane.showInputDialog("Input Radius "+(i+1)+" : "));
			double height = Double.parseDouble(JOptionPane.showInputDialog("Input Height "+(i+1)+" : "));
			cylinder[i] = new Cylinder(radius,height);
		}
		
		int count = 1;
		String output = "";
		for (Cylinder rh : cylinder) {
			output += "Cylinder "+count+", volume = "+rh.getVolume()+"\n";
			count++;
		}
		JOptionPane.showMessageDialog(null,output);
		
	}

}
