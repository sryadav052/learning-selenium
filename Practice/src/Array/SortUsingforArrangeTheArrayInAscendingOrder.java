package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SortUsingforArrangeTheArrayInAscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		System.out.println("Enter any five array elemnet:- ");
		Scanner r=new Scanner(System.in);
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=r.nextInt();
		}
		System.out.print("\nPrint array element:- ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
