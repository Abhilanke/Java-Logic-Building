package logicBuilding1;

import java.util.Scanner;

public class Condition {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number A :");
		int a = scan.nextInt();
		System.out.print("Enter Number B :");
		int b = scan.nextInt();

		if (a == b) {
			System.out.println("Equal");
		}
		if (a > b) {
			System.out.println("a is Greater");
		} else {
			System.out.println("a is Lesser");
		}
	}

}
