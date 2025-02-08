package logicbuilding;
import java.util.Scanner;
public class PerfectNumber {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter your Number :-");
		int a=scan.nextInt();
		
		double sqrt=Math.sqrt(a);
		double sqrtf=Math.floor(sqrt);
		
		System.out.println(sqrt);
		System.out.println(sqrtf);
		
		if((sqrt-sqrtf)==0) {
			System.out.println("it is Perfect Number");
		}else {
			System.out.println("it is not perfect Number");
		}
		
		
	}

}
