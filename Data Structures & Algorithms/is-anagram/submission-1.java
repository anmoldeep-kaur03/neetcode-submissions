class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] sSort = s.toCharArray();
        char[] tSort = t.toCharArray();
        Arrays.sort(sSort);
        Arrays.sort(tSort);
        return Arrays.equals(sSort, tSort);
    }
}
// If the lengths of the two strings differ, return false immediately because they cannot be anagrams.
// Sort both strings.
// Compare the sorted versions of the strings:
// If they are equal, return true.
// Otherwise, return false.