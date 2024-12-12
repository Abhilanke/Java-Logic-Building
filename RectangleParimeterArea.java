package logicbuilding;

//13. Write a Java program to print the area and perimeter of a rectangle.
//Test Data:
//Width = 5.5 Height = 8.5
//
//
//Expected Output
//Area is 5.6 * 8.5 = 47.60
//Perimeter is 2 * (5.6 + 8.5) = 28.20

public class RectangleParimeterArea {

	public static void main(String[] args) {
		
//		Formula Rectangle parimeter is p=2*(l+w);
//		Formula Rectangle area is a=lw;
//      Formula Rectangle Diagonal d= squre bracket w^2+l^2
		double a,b,c,d,parimeter,area;
		a=c=5.6;
		b=d=8.5;
		parimeter=2*(a+b);
		area=a*b;
		
		System.out.println("Parimeter is : "+parimeter);
		System.out.println("Area is :"+area);
		
	
		

	}
	
	
	
	
	

}
