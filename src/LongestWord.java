public class LongestWord {
    void main() {
        System.out.println(longestWord("what a wonderful world"));
        System.out.println(longestWord("have a nice day"));
        System.out.println(longestWord("the quick brown fox jumped over the lazy dog"));
    }

    public static String longestWord(String sentence) {
        String [] words = sentence.split(" ");
        String max ="";
        for(String word : words){
            if(word.length()>=max.length()){
                max = word;
            }
        }
        return max;
        }
}