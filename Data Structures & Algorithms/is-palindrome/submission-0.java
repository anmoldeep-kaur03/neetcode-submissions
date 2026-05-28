class Solution {
    public boolean isPalindrome(String s) {
        String result = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(result);
        String reversedResult = new StringBuilder(result).reverse().toString().toLowerCase();
        System.out.println(reversedResult);
        if(result.equals(reversedResult))
        return true;
        return false;
    }
}
