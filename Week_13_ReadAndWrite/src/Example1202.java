/* Read File with BufferReader */

import java.io.*;
import java.util.*;

public class Example1202 {

	static Scanner input = new Scanner (System.in); //input object from Console
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.out.print("Input Section : ");
		int section = input.nextInt();
		Header(section);
		showListStudent(section);
	}
	
	public static void showListStudent(int sec) throws IOException{
		BufferedReader read = new BufferedReader(new FileReader("List107.txt"));
		String temp = "";
		while ((temp = read.readLine()) != null) {
			String data[] = temp.split("\t");
			double midtermscore = Double.parseDouble(data[4]);
			double finalscore = Double.parseDouble(data[5]);
			String POrF = findResult(midtermscore,finalscore);
			if(Integer.parseInt(data[3]) == sec) {
				System.out.println(data[0]+"\t"+data[2]+"\t"+midtermscore+"\t"+finalscore+"\t"+POrF);
			}
		}
		read.close();
	}
	
	public static void Header(int sec) {
		System.out.println("*****************************************************************");
		System.out.println("                    List of Data for Section "+sec);
		System.out.println("*****************************************************************");
	}
	
	public static String findResult(double Mscore,double Fscore) {
		return ((Mscore+Fscore)>=40)?"PASS":"FAIL";
	}

}
