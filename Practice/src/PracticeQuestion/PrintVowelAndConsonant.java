package PracticeQuestion;
// Check the character is it vowel or consonant. charater is input from the user side if the input is not a type of
// lowercase and uppercase then print a error message for users 
// If characters is more than one alphabet then also print a error message for users to enter only character not string


import java.util.Scanner;

public class PrintVowelAndConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter any input from users:- ");
		Scanner rScanner=new Scanner(System.in);
		String input=rScanner.next().toLowerCase();
		
		boolean uppercase=input.charAt(0)>=65 && input.charAt(0)<=90;
		boolean Lowercase=input.charAt(0)>=97 && input.charAt(0)<=122;
		boolean vowels=input.equals("a")|| input.equals("e")||input.equals("i")||input.equals("o")||
				input.equals("u");
		
		if(input.length()>1)
		{
			System.out.println("Error.input is not a single character");
		}
		else if(!(uppercase||Lowercase)) 
		{
			System.out.println("Enter input is not a uppercase or lowercase characters");
		}
		else if(vowels)
		{
			System.out.println("Entetr character is vowel");
		}
		else
		{
			System.out.println("Enter character is consnant");
		}
		
		


	}

}
