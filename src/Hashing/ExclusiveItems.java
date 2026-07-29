void main() {
    List<Integer> a = List.of(4,2,1,6);
    List<Integer> b = List.of(3,6,9,2,10);
    System.out.println(exclusiveItems(a,b));
}
public static List<Integer> exclusiveItems(List<Integer> a, List<Integer> b) {
    HashSet<Integer> setA = new HashSet<>(a);
    HashSet<Integer> setB = new HashSet<>(b);
    List<Integer> result = new ArrayList<>();
    for (int itemA : a) {
        if (!setB.contains(itemA)) {
            result.add(itemA);
        }
    }
    for (int itemB : b) {
        if (!setA.contains(itemB)) {
            result.add(itemB);
        }
    }
    return result;
}