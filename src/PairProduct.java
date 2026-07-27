void main() {
  //  System.out.println(pairProduct(List.of(3, 2, 5, 4, 1), 8));
    System.out.println(pairProduct(List.of(3, 2, 5, 4, 1), 10));
}
public static List<Integer> pairProduct(List<Integer> numbers, int target) {
    HashMap<Integer, Integer> previousNums = new HashMap<>();
    List<Integer> result = new ArrayList<>();
    int complement;
    for(int i = 0 ; i < numbers.size(); i++) {
        complement = target/numbers.get(i);
        if(!previousNums.containsKey(complement) || target % numbers.get(i) != 0) {
            previousNums.put(numbers.get(i) , i);
        }else{
            result.add(previousNums.get(complement));
            result.add(i);
        }
    }
    return result;
}