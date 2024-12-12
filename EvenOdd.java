package logicbuilding;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Your Number :-");
		int a=scan.nextInt();
		
		if((a%2)==0) {
			System.out.println("Even Number >>> "+a);
		}
		else {
			System.out.println("Odd Number >>> "+a);
		}
	}

}
