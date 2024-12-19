package logicbuilding;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n=10;
		int num1=0;
		int num2=1;
		System.out.println("Fibonacci Series >> " +num1+ ","+num2);
		for(int i=2;i<n;i++) {
			int num3=num1+num2;
			System.out.println(+num3);
			num1=num2;
			num2=num3;
		}
		

	}

}
