class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] count = new int[26]; // to count each character

        // Count frequencies of characters in text
        for (char c : text.toCharArray()) {
            count[c - 'a']++;
        }

        // Calculate minimum number of full "balloon" words
        int b = count['b' - 'a'];
        int a = count['a' - 'a'];
        int l = count['l' - 'a'] / 2; // need 2 l's
        int o = count['o' - 'a'] / 2; // need 2 o's
        int n = count['n' - 'a'];

        // Return the minimum among all required character counts
        return Math.min(Math.min(Math.min(b, a), Math.min(l, o)), n);
    }
}
