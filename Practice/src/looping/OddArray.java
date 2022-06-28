package looping;

public class OddArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int max=0;
	    int number=0;
		int[] array=new int[] {25,30,35,78,98,889,21,30};
		for(int i=0;i<array.length;i++) {
			number=array[i];
			if(number>max) {
				max=number;
			}
						
		}
		System.out.print(max+" | ");
		

	}

}
