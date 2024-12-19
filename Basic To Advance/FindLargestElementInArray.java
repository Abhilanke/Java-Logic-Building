package logicbuilding;

public class FindLargestElementInArray {

	public static void main(String[] args) {
		int[] arr={2,4,5,3,1};
		int largest=arr[0];
		for(int num:arr) {
			if(num>largest) {
				largest=num;
			}
			
		}
		System.out.println(largest);

	}

}
