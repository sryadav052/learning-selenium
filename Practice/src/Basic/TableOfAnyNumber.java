package Basic;

import java.util.Scanner;

public class TableOfAnyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num ;
		System.out.println("Enter a Number:- ");
		Scanner scn=new Scanner(System.in);
		num=scn.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(num+"*"+i+"="+num*i);
		}

	}

}
