package Basic;

import java.util.Scanner;

public class reverseOrder1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,r = 0;
		System.out.print("Enter a Number:- ");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		while(n>0) {
			r=n%10;
			System.out.print(r);
			n=n/10;
			
		}
		
		

	}

}
