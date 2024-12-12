package logicbuilding;
//25. Octal to Decimal Converter
//
//Write a Java program to convert a octal number to a decimal number.
//Input Data:
//Input any octal number: 10
//Expected Output
//
//Equivalent decimal number: 8   
import java.util.Scanner;

public class OctaltoDecimalConverter {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Your Octal Number >> ");
		String a=scan.next();
		
		int b=Integer.parseInt(a,8);
		
		System.out.println("Octal to Decimal Converter >> "+b);

	}

}
