package PracticeQuestion;

import java.util.Scanner;

public class printWeekDaysAftertakingIntegerfromUsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day;
		System.out.println("Enter your day in integer form:- ");
		Scanner rScanner=new Scanner(System.in);
		day=rScanner.nextInt();
		
		switch(day)
		{
		case 1: System.out.println("monday");
		  break;
		case 2: System.out.println("Tuesday");
		  break;
		case 3: System.out.println("Wednesday");
		  break;
		case 4: System.out.println("Thursday");
		  break;
		case 5: System.out.println("friday");
		  break;
		case 6: System.out.println("Saturday");
		  break;
		case 7: System.out.println("Sunday");
		  break;
		  default:System.out.println("Invalid Day");
		  
		}

	}

}
