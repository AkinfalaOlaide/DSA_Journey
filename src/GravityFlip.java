import java.util.Arrays;

public class GravityFlip {
    void main() {
        System.out.println(Arrays.toString(flip('L', new int[]{3, 2, 1, 2})));

    }
    public static int[] flip(char dir, int[] arr) {
        if(dir == 'R') {
            Arrays.sort(arr);
        }else {
            for (int i = 0; i < arr.length / 2; i++) {
                int temp = arr[i];
                arr[i] = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = temp;
            }
        }
        return arr;
    }
}
