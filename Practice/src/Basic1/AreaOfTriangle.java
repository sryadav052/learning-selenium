package Basic1;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,sp;// sp=semiperimeter
		double Area;
		System.out.print("Enter the value of all side of triangle:- ");
		Scanner scn=new Scanner(System.in);
		a=scn.nextInt();
		b=scn.nextInt();
		c=scn.nextInt();
		
		sp=(a+b+c)/2;
		 Area=Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
		System.out.println("Area of triangle= "+Area);

	}

}
