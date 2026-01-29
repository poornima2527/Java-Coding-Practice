import java.util.*;
public class nmeetingroom {
    public int[][] meeting(int[][] interval) {
        if(interval.length==0){
            return new int[0][0];
            Arrays.sort(interval,(a,b)->a[0]-b[0]);
            List<int[]>result = new ArrayList<>();
            int[] current = interval[0];
            int[] next = interval[1];
            if(current[0]==next[1]||current[0]>next[1]) {
                return new int[0][0];
            } else {
                current = next;
                result.add(current);
            }
        }
        System.out.println(result);
    }
}