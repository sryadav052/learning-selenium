package Basic;

public class A {
	int b=20; // instance variables
	static int c=30; // static variables

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10; // local variables
		// for local variables no need to create object its directly 
		System.out.println(a);
		// for instance variable we need to create the object for recall that data
		// object create syntax   class name ref= new class name();
		A ref= new A();
		System.out.println(ref.b);
		// for static variables no need to create object it is directly call by class name
		System.out.println(A.c);

	}

}
