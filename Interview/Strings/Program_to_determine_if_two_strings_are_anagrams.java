package logicBuilding1.Strings;

public class Program_to_determine_if_two_strings_are_anagrams {

	public static void main(String[] args) {
		String str1="listen";
		String str2 ="silent";
		
		System.out.println(areAnagrams(str1,str2));

	}

	private static boolean areAnagrams(String str1, String str2) {
		if(str1.length() != str2.length()) {
			return false;
		}
		int[] charCount = new int [256];
		for(int i =0; i< str1.length(); i++) {
			charCount[str1.charAt(i)]++;
			charCount[str2.charAt(i)]--;
			
		}
		for(int count : charCount) {
			if(count !=0) {
				return false;
			}
		}
		return true;
	}

}
