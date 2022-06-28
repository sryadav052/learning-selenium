package PracticeQuestion;

import java.util.Scanner;

//import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class CubeOfNumberUptoInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		System.out.println("Enter any Number");
		Scanner rScanner=new Scanner(System.in);
		number=rScanner.nextInt();
		
		for(int i=1;i<=number;i++)
		{
			int m=i*i*i;
			System.out.println("Cube of "+i+ " is " +m);
		}

	}

}
