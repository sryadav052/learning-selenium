package Basic;

import java.util.Scanner;

public class PrintMaximumNumberBetweenTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		System.out.print("Enter any two Number:- ");
		Scanner scn=new Scanner(System.in);
		a=scn.nextInt();
		b=scn.nextInt();
	//Use if and else condition here
		if(a>b) {
			System.out.println(a);
		}
		else {
			System.out.println(b);
		}

	}

}
