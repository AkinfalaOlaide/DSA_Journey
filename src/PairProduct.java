void main() {
    System.out.println(pairProduct(List.of(3, 2, 5, 4, 1), 8));
    System.out.println(pairProduct(List.of(3, 2, 5, 4, 1), 10));
}
public static List<Integer> pairProduct(List<Integer> numbers, int target) {
    HashMap<Double, Integer> previousNums = new HashMap<>();
    double complement;
    for(int i = 0 ; i < numbers.size(); i +=1) {
        int num = numbers.get(i);
        complement = (double) target/num;
        if(previousNums.containsKey(complement)) {
           return List.of(previousNums.get(complement), i);
        }
        previousNums.put((double) num ,i);
    }
    return null;
}