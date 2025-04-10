import java.util.*;

class Solution {
    public String reverseWords(String s) {
        // Step 1: Trim leading and trailing spaces
        s = s.trim();

        // Step 2: Split the string into words based on one or more spaces
        // This handles multiple spaces between words
        String[] words = s.split("\\s+");

        // Step 3: Reverse the words using a StringBuilder
        StringBuilder result = new StringBuilder();

        // Loop from the end to the beginning of the words array
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);

            // Add a space if it's not the last word
            if (i != 0) {
                result.append(" ");
            }
        }

        // Step 4: Return the final reversed string
        return result.toString();
    }
}
