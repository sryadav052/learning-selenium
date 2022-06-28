package Basic1;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,c,rem,Arm=0;
		System.out.println("Enter any Number:- ");
		Scanner scn=new Scanner(System.in);
		n=scn.nextInt();
		c=n;
		
		while(n>0) {
			rem=n%10;
			Arm=(rem*rem*rem)+Arm;
			n=n/10;
		}
		if(c==Arm) {
			System.out.println("It is a Armstrong Number");
		}
		else{
			System.out.println("It is not a Armstrong Number");
			
		}

	}

}
