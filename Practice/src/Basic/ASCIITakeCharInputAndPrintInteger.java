package Basic;
// ASCII value of A is 65
//ASCII value of a is 97

import java.util.Scanner;

public class ASCIITakeCharInputAndPrintInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		System.out.println("Enter any Characters:- ");
		Scanner scn=new Scanner(System.in);
		ch=scn.next().charAt(0); 
		int a=ch; // Implicit typecasting(Beacuse integr is more byte size than charaters)
		System.out.println("ASCII value" +ch +" is " +a);
		

	}

}
