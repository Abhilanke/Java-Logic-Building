package logicbuilding;

public class CountVowelsAndConconants {

	public static void main(String[] args) {

		
		String str="Automations";

		
		int vowels=0,conconants=0;
		for(char c:str.toCharArray()) {
			if("aeiouAEOU".indexOf(c)!=-1) {
				
			vowels++;
		}else if(Character.isLetter(c)) {
			conconants++;
		}

	}
		System.out.println("Vowels >> "+vowels+  "\nConconants >> "+conconants);

	}
}
