package Array;

import java.util.Arrays;

// print array elemnet without using loop
public class toStringasListDeepTOSPing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[] = {"Sanjeev","Yadav","Motihari","Bihar"};
		System.out.println("toString() "+Arrays.toString(a));// toString is static method of array class therefore no need to create object
		System.out.println("asList() "+Arrays.asList(a));
		
		int arr[][]= {{30,40},{40,50}};
		System.out.println("deepToString() "+Arrays.deepToString(arr));
		

	}

}
