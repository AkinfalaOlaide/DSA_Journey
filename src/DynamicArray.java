import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DynamicArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        List<List<Integer>> queries = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            List<Integer> query = new ArrayList<>();
            query.add(sc.nextInt()); // type
            query.add(sc.nextInt()); // x
            query.add(sc.nextInt()); // y
            queries.add(query);
        }

        List<Integer> results = dynamicArray(n, queries);
        for (int r : results) {
            System.out.println(r);
        }
        sc.close();
    }
    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            result.add(new ArrayList<>());
        }
        int lastNumber = 0;
        List<Integer> answers = new ArrayList<>();

        for(List<Integer> query : queries){
            int type = query.get(0);
            int x = query.get(1);
            int y = query.get(2);

            int idx = (x ^ lastNumber) % n;
            if(type == 1){
                result.get(idx).add(y);
            }
            else {
                lastNumber = result.get(idx).get((y % result.get(idx).size()));
                answers.add(lastNumber);
            }
        }
        return answers;

    }
}
