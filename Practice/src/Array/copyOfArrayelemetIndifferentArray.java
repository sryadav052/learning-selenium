package Array;

import java.util.Arrays;
import java.util.Scanner;

public class copyOfArrayelemetIndifferentArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		System.out.println("Enter data in array");
		Scanner r=new Scanner(System.in);
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=r.nextInt();
		}
		int a1[]=Arrays.copyOf(a, 5);
		System.out.println("Copy Data in Array2:-");
		for(int i=0;i<a1.length;i++)
		{
			System.out.println(a1[i]+"  ");
		}
		

	}

}
