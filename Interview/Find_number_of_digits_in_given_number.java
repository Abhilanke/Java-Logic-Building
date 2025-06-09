package logicBuilding1;

import java.util.Scanner;

public class Find_number_of_digits_in_given_number {

	public static void main(String[] args) {

		
		int no=0, a=0;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter Any Number : ");
		
		no=scan.nextInt();
		if(no<0){
			no=no* -1;
		}else if(no==0) {
			no=1;
		}
		while(no>0) {
			no=no/10;
			a++;
		}
		System.out.println("Number of digits is given number is : "+a);

	}

}
