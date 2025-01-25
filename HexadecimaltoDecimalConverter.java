package logicbuilding;
//28. Hexadecimal to Decimal Converter
//
//Write a Java program to convert a hexadecimal value into a decimal number.
//Input Data:
//Input a hexadecimal number: 25
//Expected Output
//Equivalent decimal number is: 37
import java.util.Scanner;

public class HexadecimaltoDecimalConverter {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Your HexaDecimal Number >> ");
		String a=scan.next();
		
		
		int b=Integer.parseInt(a,16);
		
		System.out.println("Equivalent decimal number is >> " +b);
		

	}

}
