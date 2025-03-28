package logicBuilding1;
//Enter a number :
//1101
//1101 is not palindrome

//Enter a number :
//1001
//1001 is a palindrome


import java.util.Scanner;

public class Find_palindrome_number {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number :");
		int number=scan.nextInt();
		 if(isPalidrome(number)) {
			 System.out.println( number + " is a palindrome");
			 
		 }else {
			 System.out.println(number + " is not palindrome");
		 }

	}

	private static boolean isPalidrome(int num) {
		// TODO Auto-generated method stub
		int originalnum=num;
		int reversednumber=0;
		
		while(num !=0) {
			int digit =num %10;
			reversednumber = reversednumber * 10+digit;
			num=num/10;
			
			
		}
		
		return originalnum == reversednumber;
	}

}








