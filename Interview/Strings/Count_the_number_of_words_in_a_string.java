package logicBuilding1.Strings;
//Enter The String : Welcome to the java words
//Number of words in a String :5
import java.util.Scanner;

public class Count_the_number_of_words_in_a_string {

	public static void main(String[] args) {
		System.out.print("Enter The String : ");
		Scanner sc =new Scanner(System.in);
		String s =sc.nextLine();
		int count =1;
		 for(int i =0; i<s.length()-1;i++) {
			 if((s.charAt(i)== ' ')&& (s.charAt(i+1)!=' ')){
				 count++;
				 
				 
			 }
			 
		 }
		 System.out.println("Number of words in a String :"+count);

	}

}
