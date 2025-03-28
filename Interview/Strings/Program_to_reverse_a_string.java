package logicBuilding1.Strings;

import java.util.Scanner;

public class Program_to_reverse_a_string {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a String :");
		String a=scan.nextLine();
		
		char ch;
		String b=" ";
		for(int i=0; i< a.length();i++) {
			ch = a.charAt(i);
			b=ch+b;
		}
		System.out.println("Reversed String is : "+ b);

	}

}
