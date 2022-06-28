package Basic;

import java.util.Scanner;

public class CharacterPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		System.out.println("Enter a character:- ");
		Scanner scn=new Scanner(System.in);
		ch=scn.next().charAt(5);// Here Char Print from the 5th position if we pass 0 in parameter then char print from the first position
		System.out.println(ch);

	}

}
