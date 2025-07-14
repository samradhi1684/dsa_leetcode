import java.util.*;

public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int len1 = p.length(), len2 = s.length();
        
        if (len1 > len2) return result;

        int[] freqP = new int[26]; // Frequency of characters in p
        int[] freqWindow = new int[26]; // Frequency of characters in the current window

        // Fill freqP and freqWindow for the first window
        for (int i = 0; i < len1; i++) {
            freqP[p.charAt(i) - 'a']++;
            freqWindow[s.charAt(i) - 'a']++;
        }

        // Check if the first window is a match
        if (Arrays.equals(freqP, freqWindow)) {
            result.add(0);
        }

        // Slide the window over s
        for (int i = len1; i < len2; i++) {
            // Include the new character in the window
            freqWindow[s.charAt(i) - 'a']++;
            // Remove the old character from the window
            freqWindow[s.charAt(i - len1) - 'a']--;

            // If the window matches freqP, add the starting index
            if (Arrays.equals(freqP, freqWindow)) {
                result.add(i - len1 + 1);
            }
        }

        return result;
    }
}
