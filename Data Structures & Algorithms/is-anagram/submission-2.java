public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int val : count) {
            if (val != 0) {
                return false;
            }
        }
        return true;
    }
}
// If the lengths of the strings differ, return false immediately.
// Create a frequency array count of size 26 initialized to 0.
// Iterate through both strings:
// Increment the count at the index corresponding to s[i].
// Decrement the count at the index corresponding to t[i].
// After processing both strings, scan through the count array:
// If any value is not 0, return false because the frequencies differ.
// If all values are 0, return true since the strings are anagrams.