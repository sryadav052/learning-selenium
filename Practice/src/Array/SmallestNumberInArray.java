package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[6];
		int min;
		System.out.println("Enter any six Array element:- ");
		Scanner rScanner=new Scanner(System.in);
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=rScanner.nextInt();
		}
		System.out.print("Print Array elements:- ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.print("\nArray print in a order:- ");
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("\nSmallest number in array element:- "+min);

	}

}
