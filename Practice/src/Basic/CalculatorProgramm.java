package Basic;

import java.util.Scanner;

// Calculator programme
// take two value n1 and n2 from users and 

public class CalculatorProgramm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,choice=1;
		int cal;
		System.out.print("Enter any two number:- ");
		Scanner scn=new Scanner(System.in);
		n1=scn.nextInt();
		n2=scn.nextInt();
		System.out.print("Enter your choice:- ");
		choice=scn.nextInt();
		
		if(choice==1) {
			cal=n1+n2;
			System.out.print("Addition Operation "+cal);
		}
		else if(choice==2) {
			cal=n1-n2;
			System.out.print("Subtarction operation "+cal);
		}
		else if(choice==3) {
			cal=n1*n2;
			System.out.print("Multiplication Operation "+cal);
		}
		else if(choice==4) {
			double cal1=n1/n2;
			System.out.print("Division Operation "+cal1);
		}
		else if(choice==5) {
			cal=n1%n2;
			System.out.print("Remainder operation "+cal);
		}
		else {
			System.out.print("Your choice is not match ");
		}

	}

}
