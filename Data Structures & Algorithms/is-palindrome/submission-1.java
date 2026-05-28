public class Solution {
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;

        while (l < r) {
            while (l < r && !alphaNum(s.charAt(l))) {
                l++;
            }
            while (r > l && !alphaNum(s.charAt(r))) {
                r--;
            }
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }
            l++; r--;
        }
        return true;
    }

    public boolean alphaNum(char c) {
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }
}
// Initialize two pointers:
// l at the start of the string,
// r at the end of the string.
// While l is less than r:
// Move l forward until it points to an alphanumeric character.
// Move r backward until it points to an alphanumeric character.
// Compare the lowercase characters at l and r:
// If they don't match, return false.
// Move both pointers inward: l += 1, r -= 1.
// If the loop finishes without mismatches, return true.