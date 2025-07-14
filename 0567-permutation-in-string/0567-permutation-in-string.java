public class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length(), len2 = s2.length();
        if (len1 > len2) return false;

        int[] freq1 = new int[26]; // frequency of s1
        int[] freq2 = new int[26]; // frequency of current window in s2

        // Fill freq1 and initial freq2
        for (int i = 0; i < len1; i++) {
            freq1[s1.charAt(i) - 'a']++;
            freq2[s2.charAt(i) - 'a']++;
        }

        // Check initial window
        if (matches(freq1, freq2)) return true;

        // Slide the window
        for (int i = len1; i < len2; i++) {
            freq2[s2.charAt(i) - 'a']++; // add new char
            freq2[s2.charAt(i - len1) - 'a']--; // remove old char

            if (matches(freq1, freq2)) return true;
        }

        return false;
    }

    // Check if two frequency arrays are equal
    private boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}
