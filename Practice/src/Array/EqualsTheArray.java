package Array;

import java.util.Arrays;
import java.util.Scanner;

public class EqualsTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		int a1[]=new int[5];
		Scanner r=new Scanner(System.in);
		
		System.out.println("Enter data in Array:- ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=r.nextInt();
			
		}
		System.out.println("Enter data in Array1:- ");
		for(int i=0;i<a.length;i++)
		{
			a1[i]=r.nextInt();
			
		}
		boolean b=Arrays.equals(a,a1);
		System.out.println("Is the arrays is equal:- "+b);

	}

}
