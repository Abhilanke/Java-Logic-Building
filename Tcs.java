import java.util.ArrayList;
import java.util.List;

public class Tcs {
    public static void main(String[] args) {
        // List of strings
        List<String> stringList = List.of("Abhi", "Abhishek", "piu", "Priyanka", "Rabbit");

        // Loop through the list and check for palindromes
        for (String str : stringList) {
            if (isPalindrome(str)) {
                System.out.println(str + " is a palindrome");
            }
        }
    }
    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        String lowerStr = str.toLowerCase(); // Convert to lowercase for case-insensitive check
        int left = 0, right = lowerStr.length() - 1;

        while (left < right) {
            if (lowerStr.charAt(left) != lowerStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

