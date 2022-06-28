package Basic;

import java.util.Scanner;

public class OddNumberPrintFromAnyRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Enter a Number n:- ");
		Scanner scn=new Scanner(System.in);
		n=scn.nextInt();
		for(int i=1;i<=n;i=i+2) {
			System.out.print(i+" ");
		}

	}

}
