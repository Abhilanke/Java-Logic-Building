package logicbuilding;
//29. Hexadecimal to Binary Converter
//
//Write a Java program to convert a hexadecimal number into a binary number.
//Input Data:
//Enter Hexadecimal Number : 37
//Expected Output

//Equivalent Binary Number is: 110111
import java.util.Scanner;

public class HexadecimaltoBinaryConverter {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter Your Hexadecimal number >> ");
		String a=scan.next();
		
		int b=Integer.parseInt(a,16);
		
		System.out.println("Hexadecimal to Binary Converter >>"+Integer.toBinaryString(b));

	} 

}
