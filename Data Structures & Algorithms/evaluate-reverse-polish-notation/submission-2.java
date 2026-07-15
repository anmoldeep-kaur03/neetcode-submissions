class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        for(String c : tokens){
            if(c.equals("+")){
                int a = stack.pop();
                int b = stack.pop();
                res = a+b;
                stack.push(res);
            } else if(c.equals("-")){
                int a = stack.pop();
                int b = stack.pop();
                res = b-a;
                stack.push(res);
            } else if(c.equals("*")){
                int a = stack.pop();
                int b = stack.pop();
                res = a*b;
                stack.push(res);
            } else if(c.equals("/")){
                int a = stack.pop();
                int b = stack.pop();
                res = b/a;
                stack.push(res);
            } else{
                stack.push(Integer.parseInt(c));
            }
        }
        return stack.pop();
    }
}