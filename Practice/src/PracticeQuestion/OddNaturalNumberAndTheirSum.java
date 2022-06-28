package PracticeQuestion;

import java.util.Scanner;

public class OddNaturalNumberAndTheirSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,sum=0;
		System.out.println("Enter any natural number");
		Scanner r=new Scanner(System.in);
		num=r.nextInt();
		
		for(int i=1;i<=num;i=i+2)
		{
			System.out.print(i+" ");
			sum=sum+i;
		}
		System.out.println();
		System.out.println("Sum of odd number:- "+sum);
		

	}

}
