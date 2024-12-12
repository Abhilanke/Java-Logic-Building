package logicbuilding;
//Write a Java program using scanner  to divide two numbers and print them on the screen.
//Test Data :
//Enter your Two Number :
//40
//20
//Expected Output :
//2
import java.util.Scanner;

public class ScannerDiv {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your Two Number :");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int div=num1/num2;
		System.out.println(div);
		

	}

}
