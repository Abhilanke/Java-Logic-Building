package logicbuilding;
//11. Write a Java program to print the area and perimeter of a circle.
//Test Data:
//Radius = 7.5
//Expected Output
//Area is:176.625
//Perimeter is:47.1
public class PerimeterArea1 {
	public static void main(String[] args) { //π is 3.14 
		double redius=7.5;
		double area=3.14*redius*redius;//Formula area=πr^2 
		double peremiter=2*3.14*redius;//Formula is Peremiter=2πr
		System.out.println("Area is:" +area);
		System.out.println("Peremiter is:"+peremiter);

	}
}
