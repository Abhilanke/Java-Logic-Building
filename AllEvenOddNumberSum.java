package logicbuilding.Array;


//Write a Program To Addition of Even number and odd Number ?


public class AllEvenOddNumberSum {
	
public static void main(String[] args) {
	
	    int evenno=0;
	
	    int oddno=0;
	
		int a[]= {2,4,3,5,3};
		
		for(int i=0; i<a.length;i++) {
			if((a[i]%2)==0) {
			  evenno=evenno+a[i];	
			}else {
				oddno=oddno+a[i];
			}
		}
		System.out.println("Addition Of Even Number >>> "+evenno);
		System.out.println("Addition Of Odd  Number >>> "+oddno);
		
}

}


