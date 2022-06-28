package Basic;

import java.util.Scanner;

// print area of rectangle of any length and breadth

public class AreaOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length,breadth;
		System.out.println("Enter length and breadth of rectangle:- ");
		Scanner scn=new Scanner(System.in);
		length=scn.nextInt();
		breadth=scn.nextInt();
		int Area=length*breadth;
		System.out.println("Area of Reactangle= "+Area);
		
		

	}

}
