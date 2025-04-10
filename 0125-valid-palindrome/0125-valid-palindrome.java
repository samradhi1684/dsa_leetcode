class Solution {
    public boolean isPalindrome(String s) {
        // Step 1: Create a StringBuilder to store cleaned string
        StringBuilder cleaned = new StringBuilder();

        // Step 2: Loop through each character of the input string
        for (char c : s.toCharArray()) {
            // If the character is a letter or digit, add its lowercase to cleaned
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }

        // Step 3: Use two pointers to check if cleaned string is a palindrome
        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }

        // If we finish the loop without returning false, it's a palindrome
        return true;
    }
}
