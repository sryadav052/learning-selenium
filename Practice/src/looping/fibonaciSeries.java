package looping;
import java.util.Scanner;

public class fibonaciSeries {

	public static void main(String[] args) {
		int Number=10;
		int firstTerm=0;
		int secondTerm=1;
		int thirdTerm=0;
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print(firstTerm+" ");
		System.out.print(secondTerm+" ");
		for(int i=2;i<Number;i++){
			thirdTerm=firstTerm+secondTerm;
			firstTerm=secondTerm;
			secondTerm=thirdTerm;
			System.out.print(thirdTerm+" ");
			fibo(10);
		}
		}
		public static int fibo(int n) {
			if(n<2)	return 1;
			return fibo(n-1)+fibo(n-2);
		}

	}


