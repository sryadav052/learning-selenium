package Basic1;

import java.util.Scanner;

public class factorOfAnyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Enter any Number:- ");
		Scanner obj=new Scanner(System.in);
		n=obj.nextInt();
		
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(+i+" ");
			}

		} 

	}

}
