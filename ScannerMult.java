package logicbuilding;
//5. Write a Java program that takes two numbers as input and displays the product of two numbers.
//Test Data:
//Input first number: 25
//Input second number: 5
//Expected Output :
//25 x 5 = 125
import java.util.Scanner;

public class ScannerMult {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Input first number :");
		int num1=scan.nextInt();
		System.out.println("Input Second number :");
		int num2=scan.nextInt();
//		int mult=num1*num2;
//		System.out.println(mult);
		System.out.println(num1+ "+" +num2+ "=" +num1 * num2);

	}

}
