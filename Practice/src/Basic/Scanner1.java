package Basic;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner object
		int a;
		int b;
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Eneter value a= ");
		a=obj.nextInt();
		System.out.println("Enter value b= ");
		b=obj.nextInt();
		int sum=a+b;
		System.out.println(sum);
		

	}

}
