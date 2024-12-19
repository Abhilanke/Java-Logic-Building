package logicbuilding;

import java.util.HashSet;

public class RemoveDuplicatesInArray {

	public static void main(String[] args) {
		int[] arr= {2,5,3,2,1,5,6,1};
		HashSet<Integer>set=new HashSet<>();
		for(int num:arr) {
			set.add(num);
		}
		System.out.println(set);
	}

}
