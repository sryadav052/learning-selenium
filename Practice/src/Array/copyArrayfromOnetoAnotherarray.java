package Array;

import java.util.Scanner;

public class copyArrayfromOnetoAnotherarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		int b[]=new int[5];
		System.out.println("Enter Array Element:- ");
		Scanner r=new Scanner(System.in);
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=r.nextInt();
		}
		System.out.print("Print Array Element:- ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.print("\nCopy array element in b variable:- ");
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
			System.out.print(b[i]+" ");
		}

	}

}
