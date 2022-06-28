package Basic1;

import java.util.Scanner;

public class PrimeNumberInbetweenTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,i,j;
		System.out.println("Enter number n1 and n2:- ");
		Scanner ref=new Scanner(System.in);
		n1=ref.nextInt();
		n2=ref.nextInt();
		
		for( i=n1;i<=n2;i++) {
			for(j=2;j<=i;j++) {
				if(i%j==0) 
					break;
					
				
			}
			if(i==j) {
				System.out.println(j+" ");
			}
			
		}
		

	}

}
