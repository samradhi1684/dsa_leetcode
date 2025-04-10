class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        String ref = strs[0];

        for (int i = 0; i < ref.length(); i++) {
            char currentChar = ref.charAt(i);

            for (int j = 1; j < strs.length; j++) {
                String currentString = strs[j];

                if (i >= currentString.length() || currentString.charAt(i) != currentChar) {
                    return ref.substring(0, i);
                }
            }
        }

        return ref; // if all characters match
    }
}
