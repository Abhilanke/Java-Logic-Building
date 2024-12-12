package logicbuilding;
//18. Binary Multiplication
//
//Write a Java program to multiply two binary numbers.
//Input Data:
//Input the first binary number: 10
//Input the second binary number: 11
//Expected Output
//
//Multiplication Two Binary Number: 110 
import java.util.Scanner;

public class MultiplicationTwoBinaryNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Your First Binary Number >>  ");
		String num1=scan.next();
		System.out.print("Enter your Second Binary Number >> ");
		String num2=scan.next();
		
		int n1=Integer.parseInt(num1,2);
		int n2=Integer.parseInt(num2,2);
		
		int n3=n1*n2;
		
		System.out.println("Multiplication Two Binary Number >>  "+Integer.toBinaryString(n3));

	}

}
