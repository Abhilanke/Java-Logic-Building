package logicBuilding1;

import java.util.Scanner;

public class Find_even_and_odd_number_using_scanner {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter Any Number : ");
		int number=scan.nextInt();
		
		if(number%2==0) {
			System.out.println("Number is even : "+number);
		}else {
			System.out.println("Number is odd : "+number);
		}

	}

}
