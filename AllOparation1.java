package logicbuilding;
//6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
//Test Data:
//Input first number: 125
//Input second number: 24
//Expected Output :
//125 + 24 = 149
//125 - 24 = 101
//125 x 24 = 3000
//125 / 24 = 5
//125 mod 24 = 5 
import java.util.Scanner;
public class AllOparation1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input first number:");
		int num1=scan.nextInt();
		System.out.println("Input Second number:");
		int num2=scan.nextInt();
		int add=num1+num2;
		int sub=num1-num2;
		int mult=num1*num2;
		int div=num1/num2;
		int mode=(num1 % num2);
		System.out.println(num1+" + "+num2+" = "+add);
		System.out.println(num1+" - "+num2+" = "+sub);
		System.out.println(num1+" * "+num2+" = "+mult);
		System.out.println(num1+" / "+num2+" = "+div);
		System.out.println(num1+" % "+num2+" = "+mode);
		

	}

}
