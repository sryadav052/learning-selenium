package Basic;

import java.util.Scanner;

public class CounNumberOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		System.out.println("Enter a Number:- ");
		Scanner scn=new Scanner(System.in);
		long n=scn.nextLong();
		while(n>0) {
			n=n/10;
			count++;
		}
		System.out.print("Total number of digit:- " +count);
// 987654321
		//123456789
	}

}
