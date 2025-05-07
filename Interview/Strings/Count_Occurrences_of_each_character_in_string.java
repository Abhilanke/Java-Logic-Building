package logicBuilding1.Strings;

import java.util.HashMap;

public class Count_Occurrences_of_each_character_in_string {

	public static void main(String[] args) {
		ChatecterCount("Test Automation java Automation");
		

	}

	static void ChatecterCount(String inputString) {
		
	HashMap<String, Integer> charCountMap = new HashMap<>();
	
	for(String s : inputString.split(" ")) {
		
		
		if(charCountMap.containsKey(s)) {
			charCountMap.put(s, charCountMap.get(s)+1);
		}else {
			charCountMap.put(s,1);
		}
	}
		
	System.out.println("Conut of characters in a given string :"+charCountMap);
	
		
	}

}
