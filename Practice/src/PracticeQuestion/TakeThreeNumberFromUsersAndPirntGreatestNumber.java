package PracticeQuestion;

import java.util.Scanner;

public class TakeThreeNumberFromUsersAndPirntGreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  
		int number1,number2,number3;
		System.out.println("take three number from users number1,number2 and number3:- ");
		Scanner r=new Scanner(System.in);
		number1=r.nextInt();
		number2=r.nextInt();
		number3=r.nextInt();
		
		if(number1>number3)
		{
			if(number1>number2)
			{
				System.out.println("number1 is greatest number");
			}
			else
			{
				System.out.println("number2 is greatest number");
			}
			
		}
		else{
			if(number2>number3)
			{
				System.out.println("number2 is greatest number");
			}
			else
				{
					System.out.println("number3 is greatest number");
				}
			}
			
			
		}
		

	}


