void main() {
  //  System.out.println(pairProduct(List.of(3, 2, 5, 4, 1), 8));
    System.out.println(pairProduct(List.of(3, 2, 5, 4, 1), 10));
}
public static List<Integer> pairProduct(List<Integer> numbers, int target) {
    HashMap<Integer, Integer> previousNums = new HashMap<>();
    List<Integer> result = new ArrayList<>();
    int complement;
    for(int i = 0 ; i < numbers.size(); i++) {
        int num = numbers.get(i);
        complement = target/num;
        if(!previousNums.containsKey(complement) || target % num != 0) {
            previousNums.put(num , i);
        }else{
            result.add(previousNums.get(complement));
            result.add(i);
        }
    }
    return result;
}