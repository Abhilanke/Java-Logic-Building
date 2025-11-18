package logicbuilding;
//32. Compare Two Numbers
//
//Write a Java program to compare two numbers.



//Input Data:
//Input first integer: 25
//Input second integer: 39
//Expected Output
//
//25 != 39                                                                          
//25 < 39                                                                           
//25 <= 39
import java.util.Scanner;

public class CompareTwoNumbers {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter your First Number :>> ");
		int num1=scan.nextInt();
		System.out.print("Enter your Second Number :>> ");
		int num2=scan.nextInt();
		
		if(num1 != num2) {
			System.out.println(num1+" != "+num2);
		}
		else {
			System.out.println(num1+" = "+num2);
			
		}
		if(num1 < num2) {
			System.out.println(num1+" < "+num2);
			
		}
		if(num1 <= num2) {
			System.out.println(num1+" <= "+num2);
			
		}else {
			System.out.println(num1+" >= "+num2);
			
		}
		
//		// Compare and display the results
//        if (num1 == num2)
//            System.out.printf("%d == %d\n", num1, num2);
//        if (num1 != num2)
//            System.out.printf("%d != %d\n", num1, num2);
//        if (num1 < num2)
//            System.out.printf("%d < %d\n", num1, num2);
//        if (num1 > num2)
//            System.out.printf("%d > %d\n", num1, num2);
//        if (num1 <= num2)
//            System.out.printf("%d <= %d\n", num1, num2);
//        if (num1 >= num2)
//            System.out.printf("%d >= %d\n", num1, num2);
		

	}

}


