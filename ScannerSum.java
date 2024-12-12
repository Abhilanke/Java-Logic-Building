package logicbuilding;
//Write a Simple Java program to print the sum of two numbers using Scanner .
import java.util.Scanner;

public class ScannerSum {
	public static void main(String args[]) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Your First Number :-");
		int num1 =scan.nextInt();
		System.out.println("Enter Your Second Number :-");
		int num2=scan.nextInt();
		int sum=num1+num2;
		int sub=num1-num2;
		int mult=num1*num2;
		int div=num1/num2;
		System.out.println("Addition is: "+sum);
		System.out.println("Substraction is: "+sub);
		System.out.println("Multiplication is: "+mult);
		System.out.println("Division is: "+div);
		
		
	}

}
