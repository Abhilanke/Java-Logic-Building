package logicbuilding;
//11. Write a Java program to print the area and perimeter of a circle.
//Test Data:
//Radius = 7.5
//Expected Output
//Area is:176.625
//Perimeter is:47.1
import java.util.Scanner;

public class PerimeterArea {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Redius :");
		double redius=scan.nextDouble();
		//Using formula  area = πr^2 and Peremiter=2πr and π is 3.14
		 System.out.println("Area is:" +(3.14*redius*redius));
		 System.out.println("Perimeter is:" +(2*3.14*redius));

	}

}
