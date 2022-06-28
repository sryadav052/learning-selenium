package Basic1;

import java.util.Scanner;

//A---> a uppercase to lowercase
//n--->N Lowercase to Uppercase

public class ChangeChareacterLowercasetoUppercaseAndViceVerssa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		System.out.println("Enter Any character:- ");
		Scanner scn=new Scanner(System.in);
		ch=scn.next().charAt(0);
		 if(ch>='A' && ch<='Z' ) {
			 char change=Character.toLowerCase(ch);
			 System.out.println("Lowercase "+change);
		 }
		 else {
			 char change=Character.toUpperCase(ch);
			 System.out.println("Uppercase "+change);
		 }

	}

}
