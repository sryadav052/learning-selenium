package Basic;

import java.util.Scanner;

public class CheckVowelAndCostant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		System.out.println("Enter a characetr:- ");
		Scanner obj=new Scanner(System.in);
		ch=obj.next().charAt(0);
		if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			System.out.println("Vowel");
		}
		else {
			System.out.println("Consonant");
		}

	}

}
