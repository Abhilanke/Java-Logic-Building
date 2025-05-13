package logicBuilding1;

import java.util.Scanner;

public class Calculator {
	

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Select One Operation :>");
		System.out.println("1. Addition ");
		System.out.println("2. Substraction");
		System.out.println("3. multiplication");
		System.out.println("4. Division");

		System.out.println("Choice Oparation 1 ,2 ,3 ,4  >>> ");
		int button = scan.nextInt();
		System.out.print("Enter your Fisrt number : ");
		int num1 = scan.nextInt();
		System.out.print("Enter Your Second Number :");
		int num2 = scan.nextInt();

		int sum, sub, mul, div;

		switch (button) {
		case 1: {
			sum = num1 + num2;
			System.out.println("Total Sum is >>  " + sum);
			break;
		}
		case 2: {

			sub = num1 - num2;
			System.out.println("Total Sub is >>  " + sub);
			break;
		}
		case 3: {
			mul = num1 * num2;
			System.out.println("Total Mult is >>  " + mul);
			break;
		}
		case 4: {
			div = num1 / num2;
			System.out.println("Total Div is >>  " + div);
			break;
		}

		}

	}
}
