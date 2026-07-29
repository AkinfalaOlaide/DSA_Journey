void main() {
    System.out.println(mostFrequentChar("Bookk"));
    
}
public static char mostFrequentChar(String s) {
    HashMap<Character, Integer> string1 = charCount(s);
    char mostFrequent = '\0';
    for(char c : s.toLowerCase().toCharArray()){
        if(mostFrequent == '\0' || string1.get(c) > string1.get(mostFrequent)){
            mostFrequent = c;
        }
    }
    return mostFrequent;
}
public static HashMap<Character, Integer> charCount(String s) {
    HashMap<Character, Integer> count = new HashMap<>();
    for (char c : s.toLowerCase().toCharArray()) {
        count.put(c, count.getOrDefault(c, 0) + 1);
    }
    return count;
}