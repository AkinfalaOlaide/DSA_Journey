import java.util.ArrayList;
import java.util.List;

public class Pairs {
    void main(){
        System.out.println(pairs(List.of("a","b","c")));

    }

    public static List<List<String>> pairs(List<String> elements) {
        List<List<String>> pairs = new ArrayList<>();
        for(int i=0;i<elements.size();i++){
            for(int j=i+1;j<elements.size();j++){
                pairs.add(List.of(elements.get(i),elements.get(j)));
            }
        }
        return  pairs;
    }

}
