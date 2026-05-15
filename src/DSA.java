
import java.util.Arrays;
import java.util.List;

public class DSA {
    static void main() {
        List<List<Integer>> arr = Arrays.asList(
                Arrays.asList(-9, -9, -9,  1,  1,  1),
                Arrays.asList( 0, -9,  0,  4,  3,  2),
                Arrays.asList(-9, -9, -9,  1,  2,  3),
                Arrays.asList( 0,  0,  8,  6,  6,  0),
                Arrays.asList( 0,  0,  0, -2,  0,  0),
                Arrays.asList( 0,  0,  1,  2,  4,  0)
        );

        int result = hourglassSum(arr);
        System.out.println("Maximum hourglass sum: " + result);

        int[][] myArray = {
                {-9, -9, -9,  1,  1,  1},
                { 0, -9,  0,  4,  3,  2},
                {-9, -9, -9,  1,  2,  3},
                { 0,  0,  8,  6,  6,  0},
                { 0,  0,  0, -2,  0,  0},
                { 0,  0,  1,  2,  4,  0}
        };

        int result2 = hourglassSumArray(myArray);
        System.out.println("Maximum hourglassArray sum: " + result2);
    }
    public static int hourglassSum(List<List<Integer>> arr) {
        int max = Integer.MIN_VALUE; // we are using this and not zero because we can have negative number in each cell of the arrays
        for (int i = 0; i <= 3 ; i++) {
            for (int j = 0; j <= 3 ; j++) {
                int sum = arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2) + arr.get(i+1).get(j+1)+
                        arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);
                if (sum > max) {
                    max = sum;
                }
            }

            }
        return max;


    }
    public static int hourglassSumArray(int [][] arr) {
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i <= 3 ; i++) {
            for (int j = 0; j <= 3 ; j++) {
                int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1]
                        + arr[i+2][j+2] ;
                if (sum > maxValue) {
                    maxValue = sum;
                }
            }
        }
        return maxValue;
    }
}
