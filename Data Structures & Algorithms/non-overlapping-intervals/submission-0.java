class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int count = 0; //[1,2],[1,4],[2,4]
        int prevEnd = intervals[0][1]; // 2
        for(int i = 1; i<intervals.length; i++){
            int start = intervals[i][0];  //2
            int end = intervals[i][1];  //4
            if(start >= prevEnd){ //2>=2
                prevEnd = end;
            } else {
                count++; //1
                prevEnd = Math.min(end, prevEnd); // 4 2
            }
        }
        return count;

    }
}
