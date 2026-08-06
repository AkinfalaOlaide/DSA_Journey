void main() {
    System.out.println(sumOfLengths(List.of("goat", "cat", "purple")));
}
public static int sumOfLengths(List<String> strings) {
    if(strings.isEmpty()){
        return 0;
    }

    return strings.getFirst().length() + sumOfLengths(strings.subList(1, strings.size()));
}