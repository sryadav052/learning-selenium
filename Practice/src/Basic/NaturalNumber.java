package Basic;

import java.util.Scanner;

public class NaturalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Enter any term:- ");
		Scanner scn=new Scanner(System.in);
		n=scn.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.print(i+" ");
		}

	}

}
