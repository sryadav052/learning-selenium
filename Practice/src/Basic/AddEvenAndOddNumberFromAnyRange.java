package Basic;

import java.util.Scanner;

public class AddEvenAndOddNumberFromAnyRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int i;
		int sum=0;
		System.out.println("Enter a number n:- ");
		Scanner scn=new Scanner(System.in);
		n=scn.nextInt();
		if(n%2==0) {  /// Add all Even Number in between the range from the 0 to n number
			for(i=0;i<=n;i=i+2) {
				sum=sum+i;
				
			}
			System.out.print("Sum of all even number in between the range= " +sum);
		}
		else { // Add all odd number in between the range from 1 to n number
			for(i=1;i<=n;i=i+2) {
				sum=sum+i;
				
			}
			System.out.print("Sum of all odd number in between the given range= " +sum);
		}
		

	}

}
