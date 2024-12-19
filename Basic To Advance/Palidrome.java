package logicbuilding;

public class Palidrome {

	public static void main(String[] args) {
		String str="madam";
		String reverced=new StringBuilder(str).reverse().toString();
		System.out.println(str.equals(reverced));

	}

}
