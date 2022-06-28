package Basic1;
// Area of circle=Pi*radious*radious
// Pi=3.14

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int radious;
		 final double Pi=Math.PI;// final keyword is used here because we don't wabt to change the value of Pi later
		 System.out.print("Enter value of radious:- ");
		 Scanner obj=new Scanner(System.in);
		 radious=obj.nextInt();
		 double Area=Pi*radious*radious;
		 System.out.println("Area of circle:- "+Area);

	}

}
