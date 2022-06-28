package Basic1;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int sum=0;
		System.out.println("Enter any number from users");
		Scanner scn=new Scanner(System.in);
		n=scn.nextInt();
		
		while(n>0) {
			int r=n%10;
			 sum=sum+r;
			 n=n/10;
		}
		System.out.println("Sum of digit "+sum);

	}

}
