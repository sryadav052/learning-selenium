package Array;

public class bigg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,20,90,49,43,50,48,54,78};	
		int min =0 ;
		for(int i=0;i<a.length;i++)
		{			
			if(a[i]<min && a[i]<90)
			{
				min=a[i];
			}
			
		}
		if(min==0)	System.out.println("No element exist for the case");
		else
	System.out.println(min);
	
	//complexity
	//O(n)+O(n) = 2O(n)
	//O(n^2) => worst case
	//O(1) => best case
}
}
