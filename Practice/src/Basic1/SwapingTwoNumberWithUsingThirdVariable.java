package Basic1;

import java.util.Scanner;

// swipe two numbers with using third variables

public class SwapingTwoNumberWithUsingThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1,number2,temp;
		System.out.println("Enter value of number1 and number2:- ");
		Scanner scn=new Scanner(System.in);
		number1=scn.nextInt();
		number2=scn.nextInt();
		 System.out.println("Before Swapping "+number1+" "+number2);
		 // Here we use third variable to swap the two number lets assume a name temp.
		 temp=number1;
		 number1=number2;
		 number2=temp;
		 System.out.println("After swaping "+number1+" "+number2);

	}

}
