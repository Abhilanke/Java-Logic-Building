package logicbuilding;
//27. Octal to Hexadecimal Converter
//
//Write a Java program to convert a octal number to a hexadecimal number.
//Input Data:
//Input a octal number : 100
//Expected Output 
//
//Equivalent hexadecimal number: 40
import java.util.Scanner;

public class OctaltoHexadecimalConverter {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter Your Octal Number >> ");
	String a=scan.next();
	
	int b=Integer.parseInt(a,8);
	
	System.out.println("Octal to Hexa-decimal Converter >> "+Integer.toHexString(b));
	
	}

}
