package logicbuilding;
//15. Swap Variables
//Write a Java program to swap two variables.
import java.util.Scanner;

public class SwapOfTwoVariable1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int x ,y ,z;
		
		System.out.println("Input the first number :");
		x =scan.nextInt();
		System.out.println("Input the Second number :");
		y =scan.nextInt();
		
		 z=x;
		 x=y;
		 y=z;
		 
		 System.out.println("Swapped value is x,y :"+x+","+y);

	}

}
