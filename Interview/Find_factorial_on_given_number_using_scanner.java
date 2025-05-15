package logicBuilding1;

import java.util.Scanner;

public class Find_factorial_on_given_number_using_scanner {

	public static void main(String[] args) {
		
		int factorial=1;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter number : ");
		int number=scan.nextInt();
		
		for(int i=1;i<=number;i++) {
			factorial=factorial*i;
		}
		System.out.println("factorial Number is :: "+factorial);
		

	}

}
