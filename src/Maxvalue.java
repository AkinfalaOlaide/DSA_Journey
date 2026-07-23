import java.util.Arrays;

public class Maxvalue {
    void main() {
        double [] array = {-9, -8, -11, -101,  -10,  -3};
        System.out.println(maxValue(array));

    }

    public static double maxValue(double[] numbers) {
       double max = Double.NEGATIVE_INFINITY;
        for (int i = 0 ; i < numbers.length ; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
}
