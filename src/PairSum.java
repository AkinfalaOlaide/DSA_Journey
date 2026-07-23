void main() {
    System.out.println(pairSum(List.of(3, 2, 5, 4, 1),8));
    
}
public static List<Integer> pairSum(List<Integer> numbers, int target) {
   HashMap<Integer, Integer> previousNums = new HashMap<>();
   List<Integer> result = new ArrayList<>();
   int complement = 0;
  for(int i = 0 ; i < numbers.size(); i++) {
      complement = target - numbers.get(i);
      if(!previousNums.containsKey(complement)) {
          previousNums.put(numbers.get(i) , i);
      }else{
          result.add(previousNums.get(complement));
          result.add(i);
      }
  }
    return result;
}