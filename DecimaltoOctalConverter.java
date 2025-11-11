package logicbuilding;

import java.util.Scanner;

//21. Decimal to Octal Converter
//Write a Java program to convert a decimal number to an octal number.
//Input Data:
//Input a Decimal Number: 15
//Expected Output
//Octal number is: 17


public class DecimaltoOctalConverter {
	

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter your Decimal Number >> ");
		int num=scan.nextInt();
		
		System.out.println("Decimal to Octal Converter >> "+Integer.toOctalString(num));

	}

}

