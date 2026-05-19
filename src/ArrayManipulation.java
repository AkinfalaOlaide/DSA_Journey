import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayManipulation {
    static void main() {
        List<List<Integer>> queries = Arrays.asList(
                Arrays.asList(1, 5, 3),
                Arrays.asList(4, 8, 7),
                Arrays.asList(6, 9, 1)
        );

        int n = 10;
        long result = arrayManipulation(n, queries);
        System.out.println(result);
    }
    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        long[] tracker  = new long[n+2];
        for(List<Integer> q : queries) {
            int a = q.get(0);
            int b = q.get(1);
            int k = q.get(2);
            tracker[a] += k;
            tracker[b+1] -= k;
        }
        long runningTotal = 0;
        long max = 0;

        for (int i = 1; i <= n; i++) {
            runningTotal += tracker[i];
            if (runningTotal > max) {
                max = runningTotal;
            }
        }

        return max;

    }
}
