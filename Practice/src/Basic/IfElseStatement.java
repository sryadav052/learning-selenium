package Basic;

import java.util.Scanner;

public class IfElseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Enter a number:- ");
		Scanner scn=new Scanner(System.in);
		n=scn.nextInt();
		
		if(n>0) {
			System.out.println("Number is +ve");
		}
		else {
			System.out.println("Numner is -ve");
		}

	}

}
