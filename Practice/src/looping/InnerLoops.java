package looping;

public class InnerLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 0;
		int[] arr = new int[] {12,345,65,3,6,32,644,75,3,22};
		for(int i =0;i<arr.length-1;i++) {
			int sum = arr[i]+arr[i+1];
			if(sum>max) {
				max = sum;
			}
		}
		System.out.println(max);
		max = 0;
		for(int i =0;i<arr.length-1;i++) {
			for(int j = i+1;j<arr.length;j++) {
				int sum = arr[i]+arr[j];
				//System.out.print(sum+"  ");
				if(sum>max) {
					max = sum;
				}
			}
		}
		System.out.println(max);
	}

}
