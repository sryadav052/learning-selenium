package Array;

import java.util.Scanner;

public class PrintArrayElementInReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		System.out.println("Enter Array Element:- ");
		Scanner rScanner=new Scanner(System.in);
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=rScanner.nextInt();
		}
		System.out.print("Array Elemnet:- ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
			
		}
		System.out.println();
		System.out.print("Reverse Array Element:- ");
		for(int i=a.length-1;i>=0;i--) 
		{
			System.out.print(a[i]+" ");
		}

	}

}
