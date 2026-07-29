void main() {
    System.out.println(intersectionWithDupes(
            List.of("a", "b", "c", "b"),
            List.of("x", "y", "b", "b")
    ));
    System.out.println(intersectionWithDupes(
            List.of("q", "b", "m", "s", "s", "s"),
            List.of("s", "m", "s")
    ));
    System.out.println(intersectionWithDupes(
            List.of("p", "r", "r", "r"),
            List.of("r")
    ));
}

public static List<String> intersectionWithDupes(List<String> listA, List<String> listB) {
    HashMap<String, Integer> mapA = count(listA);
    HashMap<String, Integer> mapB = count(listB);
    List<String> result = new ArrayList<>();
   for (String item : mapA.keySet()) {
       if (mapB.containsKey(item)) {
           int minimumTimes = Math.min(mapA.get(item), mapB.get(item));
           for  (int i = 0; i < minimumTimes; i++) {
               result.add(item);
           }
       }
   }
   return result;
}
public static HashMap<String, Integer> count(List<String> elements) {
    HashMap<String, Integer> countResult = new HashMap<>();
    for (String item : elements) {
            countResult.put(item, countResult.getOrDefault(item, 0) + 1);
    }
    return countResult;
}