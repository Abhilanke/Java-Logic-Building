package logicBuilding1;

import java.util.Scanner;


public class AgeCondition {
	
	public static void main(String[] args) {
		
		System.out.print("Enter Your Age :");
		
		Scanner scan=new Scanner(System.in);
		
		int age=scan.nextInt();
		
		if(age>=18) {
			
			
			System.out.println("Adult");
			
		}else {
			
			System.out.println("Not Adult");
			
		}

	}

}

