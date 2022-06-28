package Basic1;

import java.util.Scanner;

public class perfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0,c;
		System.out.println("Enter a number:- ");
		Scanner ref=new Scanner(System.in);
		n=ref.nextInt();
		c=n;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		if(c==sum) {
			System.out.println("Enter your number is a perfect number");
		}
		else {
			System.out.println("Enter a number by you is not a perfect number");
		}
		
	}

}
