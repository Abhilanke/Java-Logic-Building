package logicbuilding;
//20. Decimal to Hexadecimal Converter
//
//Write a Java program to convert a decimal number to a hexadecimal number.
//Input Data:
//Input a decimal number: 15
//Expected Output
//number is '0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'
//Hexadecimal number is : F
import java.util.Scanner;

public class DecimaltoHexadecimalConverter {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println(" Enter Your Decimal Number >> ");
		int num =scan.nextInt();
		
		System.out.println("Decimal to Hexadecimal Converter  >>>  "+Integer.toHexString(num));

	}

}
