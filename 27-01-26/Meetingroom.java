public int minMeetingRooms(int[][] intervals) {

    int n = intervals.length;
    int maxRooms = 0;
    for (int i = 0; i < n; i++) {
        int count = 1;
        for (int j = 0; j < n; j++) {
            if (i != j) {
                if (intervals[j][0] < intervals[i][1] &&
                    intervals[j][1] > intervals[i][0]) {
                    count++;
                }
            }
        }
        maxRooms = Math.max(maxRooms, count);
    }
    return maxRooms;
}
