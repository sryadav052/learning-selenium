package Basic;

import java.util.Scanner;

public class AverageMarksOfFiveSubject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int math,phy,che,eng,hin,bio;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Math Marks:- ");
		math=s.nextInt();
		System.out.print("Enter phy Marks:- ");
		phy=s.nextInt();
		System.out.print("Enter che Marks:- ");
		che=s.nextInt();
		System.out.print("Enter eng Marks:- ");
		eng=s.nextInt();
		System.out.print("Enter hin Marks:- ");
		hin=s.nextInt();
		System.out.print("Enter bio Marks:- ");
		bio=s.nextInt();
		
		int sum=math+phy+che+eng+hin+bio;
		double avg=sum/6.0;
		System.out.println("Avg marks:- " +avg);
		
	

	}

}
