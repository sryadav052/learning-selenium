package Basic1;

import java.util.Scanner;

public class AreaOfSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int side;
	System.out.println("Enter the value of side:- ");
	Scanner scn=new Scanner(System.in);
	side=scn.nextInt();
	int Area=side*side;
	System.out.println("Area of square= "+Area);

	}

}
