class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }

        int pointer_s = 0;
        int pointer_t = 0;

        while (pointer_t < t.length()) {
            if (s.charAt(pointer_s) == t.charAt(pointer_t)) {
                pointer_s++;
            }
            pointer_t++;
            if (pointer_s == s.length()) {
                return true;
            }
        }
        return false;
    }
}