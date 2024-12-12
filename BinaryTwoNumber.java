package logicbuilding;
//17. Binary Addition
//
//Write a Java program to add two binary numbers.
//Input Data:
//Input first binary number: 10
//Input second binary number: 11
//Expected Output
//
//Sum of two binary numbers: 101
import java.util.Scanner; 
public class BinaryTwoNumber {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter Your First Binary Number :");
		String a=scan.next();
		System.out.println("Enter Your Second Binary Number :");
		String b=scan.next();
		
		int n1=Integer.parseInt(a ,2);
		int n2=Integer.parseInt(b,2);
		int n3=n1+n2;
		
		System.out.println("First Binary Number (n1) :"+Integer.toBinaryString(n1));
		System.out.println("Second Binary Number (n2) :"+Integer.toBinaryString(n2));
		System.out.println("Sum of two Binary Number (n3=n1+n2 ):"+Integer.toBinaryString(n3));
		
		
	}

}
