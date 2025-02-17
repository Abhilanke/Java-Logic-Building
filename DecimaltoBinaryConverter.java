package logicbuilding;
//19. Decimal to Binary Converter

//Write a Java program to convert an integer number to a binary number.
//Input Data:
//Input a Decimal Number : 5
//Expected Output
//Binary number is: 101 
import java.util.Scanner;

public class DecimaltoBinaryConverter {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Your Decimal Number >> ");
		int num=scan.nextInt();
		
		System.out.println("Decimal To Binary Converter Is >>"+Integer.toBinaryString(num));
		

	}

}
