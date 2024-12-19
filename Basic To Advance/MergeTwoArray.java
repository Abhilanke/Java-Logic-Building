package logicbuilding;

import java.util.Arrays;

public class MergeTwoArray {

	public static void main(String[] args) {
		int[] arr={5,2,8,1,3};
		int[] arr2= {12,21,32,41};
		int[] merged =new int[arr.length+arr2.length];
		System.arraycopy(arr, 0, merged, 0,arr.length);
		System.arraycopy(arr2, 0, merged, arr.length,arr2.length);
		System.out.println(Arrays.toString(merged));
		
		

	}

}
