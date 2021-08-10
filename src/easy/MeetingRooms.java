package easy;


import java.util.Arrays;
import java.util.Comparator;


public class MeetingRooms {

    public boolean canAttendMeetings(int[][] intervals) {
        // Write your code here
        if (intervals == null || intervals.length == 0) {
            return true;
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] ints, int[] t1) {
                return ints[0] - t1[0];
            }
        });

        int[] start = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            int[] curr = intervals[i];
            if (start[1] > curr[0]) {
                return false;
            }
            start = curr;
        }
        return true;

    }
}


