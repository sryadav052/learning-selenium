package Basic1;

import java.util.Scanner;

public class PrintDayNameByPuttingDayNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day;
		System.out.println("Enter your day no. ");
		Scanner obj=new Scanner(System.in);
		day=obj.nextInt();
		
		switch(day) {
		
		case 1:System.out.println("Monday");
		break;
		case 2:System.out.println("Tuesday");
		break;
		case 3:System.out.println("Wednesday");
		break;
		case 4:System.out.println("Thursday");
		break;
		case 5:System.out.println("friday");
		break;
		case 6:System.out.println("saturday");
		break;
		case 7:System.out.println("Sunday");
		break;
		default:System.out.println("Invalid day no.");
		}
		
		}

	}


