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
        int n = intervals.size();
        for (int i = 0; i < n; i++) {
            Interval A = intervals.get(i);
            for (int j = i + 1; j < n; j++) {
                Interval B = intervals.get(j);
                if (Math.min(A.end, B.end) > Math.max(A.start, B.start)) {
                    return false;
                }
            }
        }
        return true;
    }
}

// Let n be the number of meetings.
// For each meeting i from 0 to n - 1:
// Compare it with every meeting j where j > i:
// For meetings A and B:
// Check if they overlap using:
// min(A.end, B.end) > max(A.start, B.start)
// If an overlap is found:
// return false immediately
// If no overlapping pair is found after checking all pairs:
// return true
