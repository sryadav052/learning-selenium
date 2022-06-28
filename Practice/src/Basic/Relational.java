package Basic;

import java.util.Scanner;

public class Relational {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		System.out.println("Enter a value for a and b: ");
		Scanner obj=new Scanner(System.in);
		a=obj.nextInt();// greater
		b=obj.nextInt();// Lesser
		// Here we check the relational parameters
		System.out.println("true/false "+(a>b));
		System.out.println("true/false "+(a<b));
		System.out.println("true/false "+(a>=b));
		System.out.println("true/false "+(a<=b));
		System.out.println("true/false "+(a==b));
		System.out.println("true/false "+(a!=b));

		

	}

}
