package logicBuilding1;

import java.util.Scanner;

public class EvenOddModulo {

	public static void main(String[] args) {
		
		System.out.println("Enter Your number :");
		Scanner scan=new Scanner(System.in);
		int even=scan.nextInt();
		
		if(even % 2==0) {
			System.out.println("Even number ");
			
		}else {
			System.out.println("Odd Number");
		}

	}

}
