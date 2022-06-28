package Basic;

import java.util.Scanner;

public class AddNaturalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0,n;
		System.out.println("Enter a term n:- ");
		Scanner scn=new Scanner(System.in);
		n=scn.nextInt();
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		System.out.print(sum);

	}

}
