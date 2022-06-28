package PracticeQuestion;
import java.util.Scanner;

public class printDaysInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month;
		System.out.println("Enter number for a particular month:- ");
		Scanner rScanner=new Scanner(System.in);
		month=rScanner.nextInt();
		
		switch(month)
		{
		case 1: System.out.println("January 2022 has 31 days");
		break;
		case 2: System.out.println("february 2022 has 28 days");
		break;
		case 3: System.out.println("march 2022 has 31 days");
		break;
		case 4: System.out.println("april 2022 has 30 days");
		break;
		case 5: System.out.println("may 2022 has 31 days");
		break;
		case 6: System.out.println("june 2022 has 30 days");
		break;
		case 7: System.out.println("july 2022 has 31 days");
		break;
		case 8: System.out.println("august 2022 has 31 days");
		break;
		case 9: System.out.println("september 2022 has 30 days");
		break;
		case 10: System.out.println("october 2022 has 31 days");
		break;
		case 11: System.out.println("november 2022 has 30 days");
		break;
		case 12: System.out.println("december 2022 has 31 days");
		break;
		default:System.out.println("Invalid Number");
		}
		

	}

}
