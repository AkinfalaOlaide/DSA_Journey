 import java.util.ArrayList;
 import java.util.List;

public class FizzBuzz {
    void main(){
        System.out.println(fizzBuzz(15));

    }
    public static List<Object> fizzBuzz(int n) {
        List<Object> list = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(i % 3 == 0 && i % 5 == 0){
                list.add("fizzbuzz");
            }else if(i % 3 == 0){
              list.add("fizz") ;
            }else if(i % 5 == 0){
               list.add("buzz");
            }else{
                list.add(i) ;
            }
        }
        return  list;
    }

}
