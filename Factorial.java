package logicbuilding;

public class Factorial {
	//logic 5!=1*2*3*4*5=120
	//2!=2*1=2
   // 3!=3*2*1=6

	public static void main(String[] args) {
		int a=1;
		//int x=1; add x output is 1
		for(int i=1; i<=5;i++) {
			//x=a*i; a*i ki value store nhi ho rahi hain esliye output 1 ayega 1esliye x=1;hai.
			a=a*i;
			
			
			
		}
		System.out.println(a);
		

	}

}
