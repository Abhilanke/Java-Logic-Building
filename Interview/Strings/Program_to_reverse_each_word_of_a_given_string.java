package logicBuilding1.Strings;

public class Program_to_reverse_each_word_of_a_given_string {

	public static void main(String[] args) {
		
		reverseEachWordofString("Java is good programing langauage");
	}

	private static void reverseEachWordofString(String inputString) {
		
		
		String[] words =inputString.split(" ");
		
		String reverseString= "";
		for( int i =0; i<words.length;i++) {
			String word=words[i];
			String nstr ="";
			char ch;
			for(int j=0; j<word.length();j++) {
				ch=word.charAt(j);
				nstr=ch+nstr;
			}
			reverseString= reverseString + nstr +" ";
		}
		
		System.out.println(inputString);
		System.out.println(reverseString);
		
	}

}
