package logicBuilding1;

import java.util.Scanner;

public class Write_program_for_reverse_number {

	public static void main(String[] args) {
		int no ,rev=0,r,a;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any number (123456) : ");
		no=scan.nextInt();
		a=no;
		while(no>0) {
			r=no%10;
			rev=rev*10+r;
			no=no/10;
		}
		System.out.println("Reverse :" +rev);

	}

}
