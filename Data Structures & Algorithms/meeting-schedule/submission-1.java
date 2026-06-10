/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

public class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        Collections.sort(intervals, Comparator.comparingInt(i -> i.start));
        for(int i = 1; i< intervals.size(); i++){
            Interval i1 = intervals.get(i - 1);
            Interval i2 = intervals.get(i);
            if(i1.end>i2.start) return false;
        }
        return true;
    }
}

// Sort all meetings by their start time.
// Iterate through the sorted list starting from the second meeting:
// For each pair of adjacent meetings:
// let i1 be the previous meeting
// let i2 be the current meeting
// If i1.end > i2.start:
// the meetings overlap
// return false
// If the loop finishes without finding any overlap:
// return true
