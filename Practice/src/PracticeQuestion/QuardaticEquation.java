package PracticeQuestion;

import java.util.Scanner;

// roots= (-b+/-sqrt(b*b-4*a*c))/2*a

public class QuardaticEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		int b=5;
		int c=2;
		
		double D=b*b-4*a*c;
		if(D>0) 
		{
			double r1=(-b+Math.sqrt(D))/ (2*a);
			double r2=(-b-Math.sqrt(D))/ (2*a);
			System.out.println("Two reals roots are "+r1+ "and" +r2);
		}
		else if(D==0)
		{
			double r1=-b/(2*a);
			System.out.println("The roots are "+r1);
		}
		else 
		{
			System.out.println("No real roots are persent in this quardatic equation");
		}
		

	}

}
