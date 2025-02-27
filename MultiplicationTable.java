package logicbuilding;
//7. Write a Java program that takes a number as input and prints its multiplication table up to 10.
//Test Data:
//Input a number: 8
//Expected Output :
//8 x 1 = 8
//8 x 2 = 16
//8 x 3 = 24
//...
//8 x 10 = 80
import java.util.Scanner;
public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Input a Number :");
		int num=scan.nextInt();
		for(int i=0;i<10;i++) {
			//System.out.println(num*(i+1));
			System.out.println(num+ " * "+(i+1)+ " = "+(num*(i+1)));
			
		}

	}

}
