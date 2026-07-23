import java.util.List;

public class AllEven {
    void main(){
        System.out.println(allEven(List.of(2,2,4)));

    }
    public static boolean allEven(List<Integer> nums) {
       for (int i : nums) {
           if(i%2!=0){
              return false;
           }
       }
        return true;
    }
}
