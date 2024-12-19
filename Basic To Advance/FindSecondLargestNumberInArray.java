package logicbuilding;

public class FindSecondLargestNumberInArray {
	public static void main(String[] args) {
		int[] arr= {1,5,4,7,8,5,3,2};
		int first=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		for(int num:arr) {
			if(num>first) {
				second=first;
				first=num;
			}else if(num>second && num !=first) {
				second=num;
			}
		}
				System.out.println(second);
	}

}
