package logicbuilding.Array;
//Write a program To Sum of all number off array

public class ArraySum {

	public static void main(String[] args) {
		//Add One Array 
		int a[]= {4,7,5,2,8};
		
		int sum=0;
		
		//Adding a For Loop 
		for(int i=0; i<a.length;i++) {
			
			sum=sum+a[i];
			
		}
		System.out.println("Sum >> " +sum);
		
		
		
	}

}
