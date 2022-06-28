package Basic;

public class MemoryAllocationInStaticAndLocalVariable {
	static int a=10; // static variables static variables takes memory at once and retain it after every run
	void fun() {
		int b=10; // local variables local variables take different memory at every run
		// print the value of a and b by calling fun method 
		System.out.println(a+" "+b);
		++a; ++b; // use pre-increment 
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create reference object  for fun method
		MemoryAllocationInStaticAndLocalVariable ref=new MemoryAllocationInStaticAndLocalVariable();
		ref.fun();
		ref.fun();
		

	}

}
