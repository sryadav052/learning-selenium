package Basic;

public class ImplicitAndexplicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Implicit type casting
		int a=10;// 4bytes
		double b=a;// 8bytes 
		// Here compiler easly convert the data type from int to double (its own )
		System.out.println(b);
		 // Explicit type casting
		// Here we change double to int
		double x=10.5;// 8bytes
		// syntax int y=(int) x;
		int y=(int)x;  // 4bytes
		System.out.println(y);

	}

}
