package Basic;
//if sallary<=10000--->No tax Deduction
// If sallary>10000 b/w sallary<=100000----> 10% tax deduction
// If sallary>100000----> 20% tax deduction

import java.util.Scanner;

public class ProgrameOnTaxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sallary;
		System.out.println("Enter your Monthly Sallary:- ");
		Scanner scn=new Scanner(System.in);
		sallary=scn.nextInt();
		if(sallary<=10000) {
			double tax=sallary*0;
			System.out.print("Tax Amount= "+tax);
			
		}
		else if(sallary>10000 || sallary<=100000) {
			double tax=sallary*0.1;
			System.out.print("Tax Amonut= "+tax);
			
		}
		else{
			double tax=sallary*0.2;
			System.out.print("Tax Amount= "+tax);
		}
		

	}

}
