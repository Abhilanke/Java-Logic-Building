package logicbuilding;

public class CalculateGCDofTwoNumbers {
	public static void main(String[] args) {
		int a=62,b=48;
		while(b!=0) {
			
			int temp=b;
			b=a%b;
			a=temp;
			
		}
		System.out.println(a);
	}

}
