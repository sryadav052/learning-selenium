package Basic1;

import java.util.Scanner;

public class SwapingTheVariablesWithoutUsingThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		System.out.print("Enter any two Number:- ");
		Scanner scn=new Scanner(System.in);
		a=scn.nextInt();
		b=scn.nextInt();
	    System.out.println("Number Before Swaping "+a+" "+b);
	    a=a+b;
	    b=a-b;
	    a=a-b;
	    System.out.println("Number After Swaping "+a+" "+b);
		

	}

}
