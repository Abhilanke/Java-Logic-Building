package logicBuilding1;

import java.util.Scanner;

public class Find_armstrong_number {

	public static void main(String[] args) {
		int arm=0, a,b,c,d,no;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any number : ");
		no =scan.nextInt();
		d=no;
		while(no>0) {
			a=no%10;
			no=no/10;
			arm = arm+a*a*a;
		}
		if(arm==d){
			System.out.println("Armstrong number");
			
		}else {
			System.out.println("Not Armstrong Number");
		}
		

	}

}
