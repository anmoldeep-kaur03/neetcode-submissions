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
