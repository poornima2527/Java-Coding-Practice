public class merge {
    public static void main(String[] args) {
        int[][] intervals = { {1, 3}, {2, 4}, {5, 7}, {6, 8} };
        int[][] merged = mergeIntervals(intervals);
        for (int[] interval : merged) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }
        prev = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            int[] curr = intervals[i];
            if (curr[0] <= prev[1]) {
                prev[1] = Math.max(prev[1], curr[1]);
            } else {
                result.add(prev);
                prev = curr;
            }
        }
    }    
}