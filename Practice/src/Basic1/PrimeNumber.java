package Basic1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n ,count=0;
		System.out.println("Enter any number:- ");
		Scanner ref=new Scanner(System.in);
		n=ref.nextInt();
		
		for(int i=1;i<=n;i++) {
			if(n%i==0)
			{
				
				count++;
			}
		}
		if(count==2) {
			System.out.println("Number is a prime Number");
		}
		else {
			System.out.println("Number is not a prime number");
		}

	}

}
