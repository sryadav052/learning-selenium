package Basic;

import java.util.Scanner;

public class EvenNumberPrintFromAnyRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Enter any Number n:- ");
		Scanner obj=new Scanner(System.in);
		n=obj.nextInt();
		for(int i=0;i<=n;i=i+2) {
			System.out.print(i+" ");
		}
				
				

	}

}
