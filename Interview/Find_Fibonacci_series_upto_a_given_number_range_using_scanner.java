package logicBuilding1;

import java.util.Scanner;

public class Find_Fibonacci_series_upto_a_given_number_range_using_scanner {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter number of terms : ");
		int number=scan.nextInt();
		int first=0,second=1,next;
		System.out.print("Fibonacci series is : ");
		for(int i=0; i<=number;i++) {
			System.out.print(first+ " ");
			next=second+first;
			first=second;
			second=next;
			
		}
		

	}

}
