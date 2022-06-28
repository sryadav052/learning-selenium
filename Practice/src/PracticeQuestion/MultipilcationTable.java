package PracticeQuestion;

import java.util.Scanner;

public class MultipilcationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Enter a number for table:- ");
        Scanner rScanner=new Scanner(System.in);
        n=rScanner.nextInt();
         for(int i=1;i<=10;i++) 
         {
        	 System.out.println(n+"*"+i+"="+n*i);
         }
	}

}
