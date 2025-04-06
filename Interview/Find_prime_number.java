package logicBuilding1;

import java.util.Scanner;


public class Find_prime_number {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("enter any number : ");
        int number=scan.nextInt();
        if(isPrime(number)) {
        	System.out.println(number+ " is prime number");
        	
        }
        else {
        	
        	System.out.println(number+ " is not prime number");
        }
		
	}

	private static boolean isPrime(int num) {
		for(int i=2; i<=num / 2;i++) {
			if(num % i==0) {
				return false;
			}
			
		}
		return true;
	}

}
