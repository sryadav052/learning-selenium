package Array;

import java.util.Scanner;

public class AdditionOfArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		int sum=0;
		System.out.println("Entetr Array Element:- ");
		Scanner r=new Scanner(System.in);
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=r.nextInt();
		}
		System.out.print("Print array Element:- ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
			sum=a[i]+sum;
		}
		System.out.print("\nAddition of all array elements:-"+sum);

	}

}
