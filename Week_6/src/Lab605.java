import java.util.*;
import javax.swing.*;

public class Lab605 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] num = new int[5];
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(JOptionPane.showInputDialog("Input number " + (i + 1) + " :"));

		}
		showEven(num);
		showOdd(num);
	}

	public static void showEven(int[] nums) {
		String listEven=" ";
		for(int _number : nums) {
			if(_number%2==0) {
				listEven = listEven+_number+ " ";
			}
		}
		JOptionPane.showMessageDialog(null, "List of even number:"+"\n"+listEven);
	}

	public static void showOdd(int[] nums) {
		String listOdd=" ";
		for(int _number : nums) {
			if(_number%2!=0) {
				listOdd = listOdd+_number+ " ";
			}
		}
		JOptionPane.showMessageDialog(null, "List of odd number:"+"\n"+listOdd);

	}
}
