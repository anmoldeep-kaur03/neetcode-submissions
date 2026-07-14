class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int right = s1.length();
        int left = 0; 
        for(int i = 0; i<= (s2.length()-s1.length()); i++){
            String subString = s2.substring(left, right);
            System.out.println(subString);
            if(sortString(s1).equals(sortString(subString))){
                return true;
            } else{
                left++;
                right++;
            }
        }
        return false;
    }

    public String sortString(String s){
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        return sorted;
    }
}
