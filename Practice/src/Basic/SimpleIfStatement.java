package Basic;

import java.util.Scanner;

public class SimpleIfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		System.out.println("Enter your Age:- ");
		Scanner obj=new Scanner(System.in);
		age=obj.nextInt();
		if(age>=18) {
			System.out.println("Persons are eligible to give vote ");
		}
		System.out.println("Thank Yoy.....!");

	}

}
