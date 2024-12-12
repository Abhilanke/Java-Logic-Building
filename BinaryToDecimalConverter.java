package logicbuilding;
//22. Binary to Decimal Converter
//
//Write a Java program to convert a binary number to a decimal number.
//Input Data:
//Input a binary number: 100
//Expected Output
//
//Decimal Number: 4 
import java.util.Scanner;

public class BinaryToDecimalConverter {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Your Binary Number >> ");
		String num=scan.next();
		
		int n1= Integer.parseInt(num,2);
		
		
		System.out.println(" Binary to Decimal Converter  >>  " +n1);
		
		
	}

}
