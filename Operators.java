package basicPrograms;

public class Operators {

	public static void main(String[] args) {
		int x = 8, y = 12;

		System.out.println(y); // 12
		// x=8,y=12
		System.out.println(y++); // y=12, y=13

		// x=8, y=13
		System.out.println(--x); // x=7

		// x=7, y=13
		System.out.println(x); // 7

		// x=7, y=13
		System.out.println(++y); // y=14

		// x=7, y=14
		System.out.println(x--); // x=7, x=6

		// x=6,y=14
		System.out.println(x++); // x=6,x=7

		int i = 14, j = 6;

		// 14 + 96
		int n1 = (i++) + (j--) * (++i); // i=16,j=5, n1=110

		// 6 + 6 - 16
		int n2 = (++j) + (j++) - (i--); // j=7,i=15

		System.out.println(i); // i=15
		System.out.println(j); // j=7
		System.out.println(n1); // 110
		System.out.println(n2); // -4
		
		
//		qution 
		//x=23,y=17
//				
//				int exp1=(x++)-(--y)/(++x)*(x++);
//		int exp2=((x++)+(--y))/y--
				

	}

}
