// Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, 
// and return an array of the non-overlapping intervals that cover all the intervals in the input.
public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int[] a, int[] b) {
                if(a[0] == b[0]) {
                    return Integer.compare(a[1], b[1]);
                }
                return Integer.compare(a[0], b[0]);
            }
        });
        List<Interval> merged = new ArrayList<>();
        merged.add(new Interval(intervals[0][0], intervals[0][1]));
        for(int i=1; i<intervals.length; i++) {
            Interval last = merged.get(merged.size()-1);
            if(last.min <= intervals[i][0] && last.max >= intervals[i][0]) {
                merged.set(merged.size()-1, new Interval(last.min, Math.max(last.max, intervals[i][1])));
            } else {
                merged.add(new Interval(intervals[i][0], intervals[i][1])); 
            }
        }
        
        int[][] result = new int[merged.size()][2];
        for(int i=0; i<merged.size(); i++) {
            Interval interval = merged.get(i);
            result[i][0] = interval.min;
            result[i][1] = interval.max;
        }
        return result;
    }
    
    class Interval {
        int min; 
        int max;
        public Interval(int min, int max) {
            this.min = min;
            this.max = max;
        }
    }
}