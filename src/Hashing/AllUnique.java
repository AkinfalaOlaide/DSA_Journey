void main() {
    System.out.println(allUnique(List.of("q", "r", "s", "a")));
    System.out.println(allUnique(List.of("q", "r", "s", "a", "r", "z")));
}
public static boolean allUnique(List<String> items) {
    HashSet<String> setItem = new HashSet<>(items);
    return setItem.size() == items.size();
}