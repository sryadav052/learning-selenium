package PracticeQuestion;

import java.util.Scanner;

public class PrintNaturalNumberuptontermsAndAlsoPrintSumOfNaturalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int sum=0;
		System.out.println("Enter any natural numbber:- ");
		Scanner rScanner=new Scanner(System.in);
		n=rScanner.nextInt();
		
		for(int i=1;i<=n;i++) 
		{
			System.out.print(i+" ");
			sum=sum+i;
		}
		
		System.out.println();
		System.out.println("Sum of natural number upto n terms:- "+sum);

	}

}
