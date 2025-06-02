package logicbuilding;

public class FindMissingNumberInArray {

	public static void main(String[] args) {

        int[] arr= {1,2,4,5};
		
        int n=arr.length+1;
		
        int total=n*(n+1)/2;
		
        for(int num :arr) {
        	total-=num;
        }
        System.out.println(total);
	}

}
