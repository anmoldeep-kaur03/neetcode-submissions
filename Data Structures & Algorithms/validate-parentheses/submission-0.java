class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> mp = new HashMap<>();
        mp.put(')', '(');
        mp.put(']', '[');
        mp.put('}', '{');
        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            } else if(!stack.isEmpty() && stack.peek() == mp.get(c)){
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
