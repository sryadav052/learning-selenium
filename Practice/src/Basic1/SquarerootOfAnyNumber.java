package Basic1;

import java.util.Scanner;

public class SquarerootOfAnyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Enter any number here:- ");
		Scanner ref=new Scanner(System.in);
		n=ref.nextInt();
		double m=Math.sqrt(n);
		System.out.println("Square root of Number "+n+" is "+m);

	}

}
