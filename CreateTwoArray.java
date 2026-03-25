package logicbuilding.Array;
//Creating 2 array even and odd separeate 
public class CreateTwoArray {
	
	public static void main(String[] args) {
		int a[]= {2,1,3,4,7,8};
		int conteven=0;
		int countodd=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				conteven++;
				
			}else {
				countodd++;
				
			}	
		}
		int evenarr[]=new int[conteven];
		int oddarr[]=new int[countodd];
		int indexeven=0;
		int indexodd=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				//System.out.println(a[i]);
				evenarr[indexeven]=a[i];
				indexeven++;
			}else {
				//System.out.println(a[i]);
				oddarr[indexodd]=a[i];
				indexodd++;
			}
		}
		System.out.println("Even Number Is >> ");
		
		for(int i=0;i<evenarr.length;i++) {
			System.out.println(evenarr[i]);
		}
		System.out.println("Odd Number Is >> ");
		for(int i=0;i<oddarr.length;i++) {
			System.out.println(oddarr[i]);
		}
		
		
		
	}	
	
	
	
	
	
	
}
























