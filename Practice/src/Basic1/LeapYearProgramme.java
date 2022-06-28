package Basic1;

import java.util.Scanner;

//1.Century (centuryyear%100=0 && centuryyear%400=0)--> Leap year
//2. Year(year%100!=0 && year%4=0)--> Leap year

public class LeapYearProgramme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		System.out.println("Enter any year:- ");
		Scanner obj=new Scanner(System.in);
		year=obj.nextInt();
		
		if(year%100==0 && year%400==0 || year%100!=0 && year%4==0) {
		System.out.println(" This year is a leap year");
		

	}
	else{
		System.out.println("This year is not a leap year");
	}

}}
