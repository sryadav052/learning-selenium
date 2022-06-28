package Basic;

import java.util.Scanner;
// Here use only one if statement and multiple if-else statement and at last one else statement.

public class ElseifLadderStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks;
		System.out.println("Enter you marks:- ");
		Scanner scn=new Scanner(System.in);
		marks=scn.nextInt();
		
		if(marks>=80) {
			System.out.println("Toppers");
		}
		else if(marks<80 && marks>=60) {
			System.out.println("First Division");
		}
		else {
			System.out.println("Failed");
		}
		 
		

	}

}
