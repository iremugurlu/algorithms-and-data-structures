// You are given an array of non-overlapping intervals intervals where intervals[i] = [starti, endi] represent the start and the end of the ith interval and intervals is sorted in ascending order by starti. 
// You are also given an interval newInterval = [start, end] that represents the start and end of another interval.
// Insert newInterval into intervals such that intervals is still sorted in ascending order by starti and intervals still does not have any overlapping intervals (merge overlapping intervals if necessary).
// Return intervals after the insertion.
public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<Interval> result = new ArrayList<>();
        int index = 0;
        int start = newInterval[0];
        int end = newInterval[1];
        
        while(index < intervals.length && intervals[index][1] < start) {
            result.add(new Interval(intervals[index][0], intervals[index][1]));
            index++;
        }
        
        while(index < intervals.length && intervals[index][0] <= end) {
            start = Math.min(start, intervals[index][0]);
            end = Math.max(end, intervals[index][1]);
            index++;
        }
        
        result.add(new Interval(start, end));
        
        while(index < intervals.length) {
            result.add(new Interval(intervals[index][0], intervals[index][1]));
            index++;
        }
        
        int[][] res = new int[result.size()][2];
        for(int i=0; i<result.size(); i++) {
            res[i][0] = result.get(i).start;
            res[i][1] = result.get(i).end;
        }
        
        return res;
    }
    
    class Interval {
        int start;
        int end;
        
        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}
