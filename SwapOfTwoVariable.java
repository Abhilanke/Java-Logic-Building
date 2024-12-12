package logicbuilding;
//15. Swap Variables
//Write a Java program to swap two variables.
public class SwapOfTwoVariable {

	public static void main(String[] args) {
		int a,b,temp;
		a=23;
		b=32;
		
		System.out.println("Before Swaping a , b = "+ a + "," +b);
		
		//adding Swap 
		temp =a;
		a=b;
		b=temp;
		
		System.out.println("After Swaping a , b = "+ a + "," +b);
		
		
		

	}

}
