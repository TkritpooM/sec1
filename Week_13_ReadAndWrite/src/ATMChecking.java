import java.io.*;

public class ATMChecking extends ATMData{

	private int money;
	
	public ATMChecking(String accountNumber,String password,int money) {
		super(accountNumber,password);
		this.money = money;
	}
	
	public boolean checkBookBank() throws IOException{
		BufferedReader read = new BufferedReader(new FileReader("ATMBookBank.txt"));
		boolean check = false;
		String temp = "";
		while ((temp = read.readLine()) != null) {
		    String data[] = temp.split("\t");
		    if( (data[0].equals(super.getID()))&&(data[1].equals(super.getPass()))&&
		        (this.money<Integer.parseInt(data[2])) ) {
		    	check = true;
		    	break;
		    }
		}
		read.close();
		return (check)?true:false;
	}
	
	public void show() throws IOException{
		BufferedReader read = new BufferedReader(new FileReader("ATMBookBank.txt"));
		String temp = "";
		while ((temp = read.readLine()) != null) {
		    String data[] = temp.split("\t");
		    if( (data[0].equals(super.getID()))&&(data[1].equals(super.getPass()))&&
		        (this.money<Integer.parseInt(data[2])) ) {
		    	System.out.printf("You drawing for %.2f, get\n",this.money);
				System.out.printf("Your balance is %.2f Baht.",data[2]);
		    }
		}
		read.close();
		
	}
}
