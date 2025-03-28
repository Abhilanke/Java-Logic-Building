package logicBuilding1;

import java.util.Scanner;

public class Program_to_swap_two_numbers_without_using_third_variable {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first Number : ");
		int a=scan.nextInt();
		System.out.println("Enter the second number : " );
		int b =scan.nextInt();
		System.out.println("Before swapping : a = " + a + ",b = " +b);
		a= a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping : a = " + a + ",b = " +b);
	}

}
