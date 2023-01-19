
public class Lab501 {

	public static void main(String[] args) {
		// String format No need to import
		System.out.println(FormatNumber(500));
		System.out.println(FormatNumber('a'));
		System.out.println(FormatNumber(89.9934));
		System.out.println(FormatNumber("550"));
		
		String strNum = FormatNumber("550");
		System.out.println(strNum);

	}
	
    private static String FormatNumber(int num) { //private ����� class ����
    	return String.format("%d",num); // use return ""; for can run 
    }
    
    private static String FormatNumber(double num) {
    	return String.format("%.3f",num); //�ȹ��� 3 ���˹�  (%.3f)
    }
    
    private static String FormatNumber(String num) {
    	return String.format("%.2f",Double.parseDouble(num)); //�ȹ��� 2  ���˹�  ����¹ String --> DOUBLE
    }

}
