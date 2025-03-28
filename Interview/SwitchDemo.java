package logicBuilding1;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		System.out.print("Choice Button 1 2 3 :");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		switch (a) {
		case 1:
			System.out.println("Hello");
			break;
		case 2:
			System.out.println("Namaste");
			break;
		case 3:
			System.out.println("Welcome");
			break;
		default:
			System.out.println("Button is Invalid");
			break;
		}
	}

}
