package PracticeQuestion;

import java.util.Scanner;

public class LeapYearProgramme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		System.out.println("Enter year from users:- ");
		Scanner rScanner=new Scanner(System.in);
		year=rScanner.nextInt();
		
		if (year%100==0 && year%400==0 ||   year%4==0 && year%100!=0) 
		{
			System.out.println("Enter year is a leap year");
		}
		else 
		{
			System.out.println("Enter year is not a leap year");
		}
		

	}

}
