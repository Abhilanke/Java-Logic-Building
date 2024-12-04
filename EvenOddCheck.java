package logicbuilding.Youtube;
//Write a Program to Check Odd And even Number
import java.util.Scanner;

public class EvenOddCheck {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter Your Number >> ");
		int num=scan.nextInt();
		if((num % 2)==0) {
			System.out.println(num+"  >>  Its Even Number");
		}else {
			System.out.println(num+" >>   Its Odd Number");
			
		}

	}

}
