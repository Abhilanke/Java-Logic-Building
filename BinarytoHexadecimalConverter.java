package logicbuilding;

import java.util.Scanner;
//23. Binary to Hexadecimal Converter
//
//Write a Java program to convert a binary number to a hexadecimal number.
//Input Data:
//Input a Binary Number: 1101
//Expected Output
//
//HexaDecimal value: D  
public class BinarytoHexadecimalConverter {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Your Binary Number >> ");
		String num=scan.next();
		
		int n1= Integer.parseInt(num,2);
		
		
		System.out.println(" Binary to Hexadecimal Converter  >>  " +Integer.toHexString(n1));
		

	}

}
