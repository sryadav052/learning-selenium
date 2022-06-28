package Array;

import java.util.Scanner;

public class DynamicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,i;
		System.out.println("Enter Array  size:- ");
		Scanner ref=new Scanner(System.in);
		size=ref.nextInt();
		
		int a[]=new int[size];
		for(i=0;i<size;i++) 
		{
			a[i]=ref.nextInt();
		}
		System.out.println("Printed Array Element");
		for(i=0;i<size;i++)
		{
			System.out.println(a[i]+" ");
		}

	}

}
