package logicbuilding.Youtube;
import java.util.Scanner;// 2^2=4

public class PerfectSquareCheck {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter Your Number >> ");
		int a = scan.nextInt();
		
		double sqrt=Math.sqrt(a);
		double sqrtf=Math.floor(sqrt);
		
		System.out.println("sqrt is >> " +sqrt);
		System.out.println("sqrtf is >> " +sqrtf);
		
		//Check Perfect Square 
		if((sqrt-sqrtf)==0) {
			System.out.println("Its Perfect Square >>> " +a);
		}else {
			
			System.out.println("Its Not Perfect Square >>> " +a);
		}

	}

}
