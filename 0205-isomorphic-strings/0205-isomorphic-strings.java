import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        // If lengths are not the same, they can't be isomorphic
        if (s.length() != t.length()) {
            return false;
        }

        // Maps to track character mapping from s -> t and t -> s
        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i); // character from s
            char charT = t.charAt(i); // character from t

            // Check mapping from s to t
            if (mapST.containsKey(charS)) {
                if (mapST.get(charS) != charT) {
                    return false; // mapping doesn't match
                }
            } else {
                mapST.put(charS, charT); // create new mapping
            }

            // Check mapping from t to s
            if (mapTS.containsKey(charT)) {
                if (mapTS.get(charT) != charS) {
                    return false; // reverse mapping doesn't match
                }
            } else {
                mapTS.put(charT, charS); // create reverse mapping
            }
        }

        return true; // all mappings are consistent
    }
}
