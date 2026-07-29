void main() {
    List<Integer> a = List.of(4,2,1,6);
    List<Integer> b = List.of(3,6,9,2,10);
    System.out.println(intersection(a,b));

    List<Integer> c = List.of(4,2,1);
    List<Integer> d = List.of(1,2,4,6);
    System.out.println(intersection(c,d));

}
public static List<Integer> intersection(List<Integer> listA, List<Integer> listB) {
    List<Integer> result = new ArrayList<>();
    HashSet<Integer> setA = new HashSet<>(listA);
    for (int j : listB) {
        if (setA.contains(j)) {
            result.add(j);
        }
    }
    return result;

}