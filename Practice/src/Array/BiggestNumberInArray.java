package Array;

import java.util.Scanner;

public class BiggestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		int max;
		System.out.println("Enter any five array element:- ");
		Scanner r=new Scanner(System.in);
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=r.nextInt();
		}
		System.out.print("Print Array element:- ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("\nMax value of an array element:- "+max);

	}

}
