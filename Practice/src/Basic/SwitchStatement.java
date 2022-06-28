package Basic;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;
		int b=10;
		int ch;
		System.out.println("Enter your choice number:- ");
		Scanner scn=new Scanner(System.in);
		ch=scn.nextInt();
		switch(ch) {
		case 1: System.out.println("Sum " + (a+b));
		break;
		case 2: System.out.println("Sub " + (a-b));
		break;
		case 3: System.out.println("Multiplication " + (a*b));
		break;
		case 4: System.out.println("Divide " + (a/b));
		break;
		default:System.out.println("Invalid Choice.....!");
		
		}
		


	}

}
