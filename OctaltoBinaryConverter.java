package logicbuilding;
//26. Octal to Binary Converter
//
//Write a Java program to convert a octal number to a binary number.
//Input Data:
//Input any octal number: 7
//Expected Output   
//
//Equivalent binary number: 111  
import java.util.Scanner;

	public class OctaltoBinaryConverter {

	public static void main(String[] args) {
	   Scanner scan =new Scanner(System.in);
	   System.out.println("Enter Your Octal Number >>");
	   String a=scan.next();
	   
	   int b=Integer.parseInt(a,8);
	   
	   System.out.println("Octal to Binary Converter >> "+Integer.toBinaryString(b));
	   
	}

}
