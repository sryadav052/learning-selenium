package Basic;

import java.util.Scanner;

public class EvenAndOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Enter a number n:- ");
		Scanner scn=new Scanner(System.in);
		n=scn.nextInt();
		
		if(n%2==0) {
			System.out.println("This is an Even Number ");
		}
		else {
			System.out.println("Number is an odd number");
		}

	}

}
