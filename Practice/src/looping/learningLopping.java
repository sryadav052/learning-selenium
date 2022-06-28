package looping;

public class learningLopping {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = new int[] {23,6,76,45,72,99,23,100};
		//Elements in array
		//[23|6|76]
		// 0  1  2
//		System.out.print(intArray[0]+" | ");
//		System.out.print(intArray[1]+" | ");
//		System.out.print(intArray[2]+" | ");
		//Accessing array elements
		for(int i = 0; i<intArray.length; i++) {
			if(intArray[i]%2==0)
			System.out.print(intArray[i]+" | ");
			
		}
		System.out.println();
		for(int i = 0; i<intArray.length; i++) {
			if(i%2==0)
				System.out.print(intArray[i]+" | ");
		}
		
		
		
	}

}
