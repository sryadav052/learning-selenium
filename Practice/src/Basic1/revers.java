package Basic1;

import java.util.Scanner;

public class revers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		System.out.println("Entetr any number:- ");
		Scanner scn=new Scanner(System.in);
		number=scn.nextInt();
		
		while(number>0) {
			int r=number%10;
			System.out.print(+r);
			number=number/10;
		}

	}

}
