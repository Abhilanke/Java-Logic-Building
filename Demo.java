package logicbuilding;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter your number");
		 int fact=scan.nextInt();
		 int a=1;
		 for(int i=1;i<=fact;i++) {
			 a=a*i;
		 }
		 System.out.println(a);

	}

}
