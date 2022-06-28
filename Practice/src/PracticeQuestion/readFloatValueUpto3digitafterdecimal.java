package PracticeQuestion;
import java.util.Scanner;

public class readFloatValueUpto3digitafterdecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float number1,number2;
		System.out.println("Enter two floating number number1 and number2:- ");
		Scanner rScanner=new Scanner(System.in);
		number1=rScanner.nextFloat();
		number2=rScanner.nextFloat();
		
		number1=Math.round(number1*1000);
		number1=number1/1000;
		number2=Math.round(number2*1000);
		number2=number2/1000;
		
		
		if(number1==number2)
		{
			System.out.println("Number is same upto three decimal");
		}
		else {
			{
				System.err.println("Number is not same upto three decimal");
			}
		}
		
		
		

	}

}
