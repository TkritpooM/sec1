
public class Example601 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {12,50,93,45,75,52,80};
		for (int i = 0 ; i < num.length ; i++) {
			System.out.println("nums[" + i+1 + "] = " + num[i] );
		}
		
		int i = 1;
		for(int _num : num) {
			System.out.println("nums[" + i + "] = " + _num );
			i++;
		}

	}

}
