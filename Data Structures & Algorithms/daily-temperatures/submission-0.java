class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>();

        for(int i=0; i<temperatures.length; i++){ //7
            int curr = temperatures[i];  //73
            while(!stack.isEmpty() && curr > stack.peek()[0] ){
                int[] top = stack.pop();  //75 2
                res[top[1]] = i - top[1];
            }
            stack.push(new int[]{curr, i});
        }

        return res;
    }
}