class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        for(int [] interval : intervals){
            if(res.size() == 0){
                res.add(interval);
            } else if(interval[0] <= res.get(res.size()-1)[1]){
                int[] top = res.get(res.size()-1);
                interval[0] = Math.min(interval[0], top[0]);
                interval[1] = Math.max(interval[1], top[1]);
                res.set(res.size()-1, interval);
            } else {
                res.add(interval);
            }
        }
        return res.toArray(int[][]::new);
    }
}
