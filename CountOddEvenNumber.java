package logicbuilding.Array;
//Write a program To Count Even And Odd Number Using For Loop If Else Loop?
public class CountOddEvenNumber {
	public static void main(String[] args) {
		

	int a[]= {2,5,7,4,6,11,8};
	int countEven=0;
	int countOdd=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]%2==0) {
			countEven++;
		}else {
			countOdd++;
		}
	
	}
	System.out.println("CountEven Number >> "+countEven);
	System.out.println("CountOdd Number >> "+countOdd);
	
	}	

}
