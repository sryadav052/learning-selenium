package Basic;

import java.util.Scanner;

public class factorialValueOfAnyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,fact=1;
		System.out.print("Enter a Number:- ");
		Scanner scn=new Scanner(System.in);
		n=scn.nextInt();
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial Value of Any Number:- "+fact);

	}

}
