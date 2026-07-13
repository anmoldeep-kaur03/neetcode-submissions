class Solution {
    public int maxArea(int[] heights) {
        // 8 6 2 5 4 8 
        int l = 0, r = heights.length-1; // 1 8
        int maxArea = 0; //49
        while(l<r){
            int h = Math.min(heights[l], heights[r]);  //8
            int w = r-l;  //6
            maxArea = Math.max(maxArea, h*w); // 40
            if(heights[l] < heights[r]){ // 1 < 7
                l++; 
            } else {
                r--;
            }
        }
        return maxArea;
    }
}
