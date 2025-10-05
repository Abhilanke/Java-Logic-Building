package logicbuilding;

import java.util.Scanner;

public class HexagonArea {

	public static void main(String[] args) {
		
		System.out.println("Input the length of a side of the hexagon >> ");
		Scanner scan =new Scanner(System.in);
		int s=scan.nextInt();
		
		 // Calculate and display the area of the hexagon
        System.out.print("The area of the hexagon is: " + hexagonArea(s) + "\n");
    }

    public static double hexagonArea(double s) {
        // Calculate the area of a hexagon based on its side length
        return (6 * (s * s)) / (4 * Math.tan(Math.PI / 6));
    }
}

