package Basic1;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,c,r,sum=0;
		System.out.println("Enter any Number:- ");
		Scanner ref=new Scanner(System.in);
		n=ref.nextInt();
		c=n;
		 
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(c==sum) {
			System.out.println("It is a palindrome Number");
		}
		else {
			System.out.println("It is not a palindrome number");
		}

	}

}
