package Basic;

import java.util.Scanner;

//n=4
//p=2
//result=4*4

public class PowerCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,p,result=1;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Number");
		n=obj.nextInt();
		System.out.println("Enter Power");
		p=obj.nextInt();
		for(int i=1;i<=p;i++) {
			result=n*result;
		}
		System.out.println("power value:- " +result);

	}

}
