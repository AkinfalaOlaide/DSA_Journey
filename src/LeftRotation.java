import java.util.ArrayList;
import java.util.List;

public class LeftRotation {
    static void main(String[] args) {
        List<Integer> myArr = new ArrayList<>();
        myArr.add(1);
        myArr.add(2);
        myArr.add(3);
        myArr.add(4);
        myArr.add(5);
        System.out.println(rotateLeft(4,myArr));
        System.out.println(optimizedRotateLeft(4,myArr));
    }
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {

        int n = arr.size();
        for(int i = 0; i < d; i++){
            int first = arr.getFirst();
            for(int j = 0; j < n-1 ; j++){
                arr.set(j, arr.get(j+1));
            }
            arr.set(n-1,first );

        }
        return arr;

    }
    public static List<Integer> optimizedRotateLeft(int d, List<Integer> arr) {
        int n = arr.size();
        List<Integer> result = new ArrayList<>(n);
        d = d % n;
        for (int i = 0; i < n; i++) {
            result.add(arr.get((i + d) % n));
        }
        return result;
    }
}
