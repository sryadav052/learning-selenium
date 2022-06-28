package Basic;

import java.util.Scanner;

public class NestedIfElseStatement {
	// Nested If else Statement 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter value a:- ");
		a=scn.nextInt();
		System.out.println("Enter value b:- ");
		b=scn.nextInt();
		System.out.println("Engter value c:- ");
		c=scn.nextInt();
		
		if(a>c) {
			
			if(a>b) {
				System.out.println("A is Greater");
			}
			else {
				System.out.println("B is Greater");
			}
		}
		else {
			if(b>c) {
				System.out.println("B is grater");
			}
			else {
				System.out.println("C is grater");
			}
		}
		

	}

}
