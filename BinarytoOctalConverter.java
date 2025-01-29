package logicbuilding;
//24. Binary to Octal Converter
//
//Write a Java program to convert a binary number to an octal number.
//Input Data:
//Input a Binary Number: 111
//Expected Output
//Octal number: 7 
import java.util.Scanner;
public class BinarytoOctalConverter {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Your Binary Number >> ");
		String num=scan.next();
		
		int n=Integer.parseInt(num,2);
		
		System.out.println("Binary to Octal Converter >> " +Integer.toOctalString(n));
		
	}

}
