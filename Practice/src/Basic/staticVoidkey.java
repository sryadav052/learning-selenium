package Basic;
// if we use static main function then no need to create object in main method for recall the data

public class staticVoidkey {
	// use main method in class without using static key
	public  static class callingItself{
		static void sout() {
			// TODO Auto-generated method stub
			System.out.println("Calling Itself");
		}
	}
	public  class callingItself1{
		void sout() {
			// TODO Auto-generated method stub
			System.out.println("Calling Itself");
		}
	}
	
	void show() {
		System.out.println("Hello Sanjeev");
	}
	/*if we use the static key before the void then no need to create the object,
	Direct call the main function by using class name */
	static void run() {
		System.out.println("hello gaurav how are you");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* make reference variable for recall the main function which is out side the main method
		classname variable= new classname*/
		staticVoidkey ref= new staticVoidkey ();
		// call the function by using object
		callingItself.sout();
		ref.show();
		// Here no need to create object for for function void run
		// classname.functionname();
		staticVoidkey.run();
		
		
		System.out.println("Hi sanjeev yadav ");

	}

}
