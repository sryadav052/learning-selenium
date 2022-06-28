package Array;

import java.util.Scanner;

public class SumOfArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		int sum=0,avg=0;
		System.out.println("Enter any five array elements");
		Scanner r=new Scanner(System.in);
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=r.nextInt();
		}
		System.out.print("Print array element:-");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		for(int i=0;i<a.length;i++)
		{
			sum=a[i]+sum;
			avg=sum/5;
		}
		System.out.println();
		System.out.print(sum+" "+avg);
		

	}

}
