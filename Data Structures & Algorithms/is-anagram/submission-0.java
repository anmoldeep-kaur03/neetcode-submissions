class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> mp1 = getHashMap(s);
        HashMap<Character, Integer> mp2 = getHashMap(t);
        if(mp1.size() != mp2.size()){
            return false;
        }
        return mp1.equals(mp2);
    }

    public HashMap<Character, Integer> getHashMap(String s){
        HashMap<Character, Integer> mp1 = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            if(mp1.containsKey(s.charAt(i))){
                mp1.put(s.charAt(i), mp1.get(s.charAt(i))+1);
            } else {
                mp1.put(s.charAt(i), 1);
            }
        }
        return mp1;
    }
}
// If the two strings have different lengths, return false immediately.
// Create two hash maps to store character frequencies for each string.
// Iterate through both strings at the same time:
// Increase the character count for s[i] in the first map.
// Increase the character count for t[i] in the second map.
// After building both maps, compare them:
// If the maps are equal, return true.
// Otherwise, return false.
