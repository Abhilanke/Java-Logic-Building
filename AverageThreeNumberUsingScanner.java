package logicbuilding;
//12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.


import java.util.Scanner;
public class AverageThreeNumberUsingScanner {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your first number : ");
		int num1=scan.nextInt();
		System.out.println("Enter Your second Number : ");
		int num2=scan.nextInt();
		System.out.println("Enter Your Third Number : ");
		int num3=scan.nextInt();
		 //Formula is Average = Sum/Count 
		int sum=num1+num2+num3;//Total Addition and divided by 3
		int Average=sum/3;
		
		System.out.println("Avarage is :"+Average);
		
	}

}
