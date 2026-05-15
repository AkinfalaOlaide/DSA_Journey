import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SparseArray {

    static void main(String[] args) {
        List<String> stringList = List.of("abcde", "sdaklfj","asdjf","na", "basdn", "sdaklfj",
                "asdjf","na","asdjf", "na", "basdn", "sdaklfj", "asdjf");
        List<String> queries = List.of("abcde","sdaklfj", "asdjf", "na", "basdn");
        System.out.println(matchingStrings(stringList, queries));

    }
    public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        Map<String, Integer> counts = new HashMap<>();
        for (String s : stringList) {
            counts.put(s, counts.getOrDefault(s, 0) + 1); //can also be counts.merge(s, 1, Integer::sum);
        }
        List<Integer> result = new ArrayList<>();
        for (String query : queries) {
            result.add(counts.getOrDefault(query,0));
        }
        return result;

    }
}
