package PracticeQuestion;

import java.util.Scanner;

public class PrintAbsolutePositiveAndNegativeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double number;
		System.out.println("Enter a Number:- ");
		Scanner ref=new Scanner(System.in);
		number=ref.nextDouble();
		
		if(number>0) {
			if(number<1) 
			{
			 System.out.println("Small positive Number");	
			}
			else if(number>100000)
			{
				System.out.println("Large positive number");
			}
			else 
				{
					System.out.println("Positive number");
				}
			
		}
		else if(number<0)
		{
		  if(Math.abs(number)<1)
		  {
			  System.out.println("small negative number");
		  }
		  else if(Math.abs(number)>100000)
		  {
			  System.err.println("Large negative number");
		  }
		  else 
		  {
			  System.out.println("Negative number");
		  }
		}
		else {
			System.out.println("Zero Number");
		}

	}

}
