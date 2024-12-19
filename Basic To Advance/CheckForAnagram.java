package logicbuilding;


import java.util.Arrays;

public class CheckForAnagram {

	public static void main(String[] args) {
		String str="listen", str2="silent";
		char[]arr=str.toCharArray();
		char[]arr2=str2.toCharArray();
		Arrays.sort(arr);
		Arrays.sort(arr2);
		System.out.println(Arrays.equals(arr, arr2));
		//System.out.println(arr+ "<>"+arr2);

	}
	
}

