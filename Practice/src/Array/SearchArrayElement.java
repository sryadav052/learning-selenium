package Array;

import java.util.Scanner;

public class SearchArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		int n,count=0;
		System.out.println("Enter any five array element:- ");
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
		System.out.println("\nEnter search Element:- ");
		n=r.nextInt();
		for(int i=0;i<a.length;i++)
		{
		 if(a[i]==n) 
		 {
			 count++;
		 }
		}
		if(count>0)
			System.out.println("Element Found");
		else {
			System.out.println("Element Not found");
		}

	}

}
