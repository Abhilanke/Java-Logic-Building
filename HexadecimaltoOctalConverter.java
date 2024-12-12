package logicbuilding;
//30. Hexadecimal to Octal Converter
//
//Write a Java program to convert a hexadecimal value into an octal number.
//Input Data:
//Input a hexadecimal number: 40
//Expected Output
//
//Equivalent of octal number is: 100
import java.util.Scanner;

public class HexadecimaltoOctalConverter {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Your Hexadecimal Number >>");
		String a=scan.next();
		
		int b=Integer.parseInt(a,16);
		
		System.out.println("Hexadecimal to Octal Converter >> "+Integer.toOctalString(b) );

	}

}
