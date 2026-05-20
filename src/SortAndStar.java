
public class SortAndStar {
    void main() {
        String[] laide = new String[]{"abeyyy", "Baller", "Abosktu"};
        System.out.println(twoSort(laide));
        System.out.println(twoSort2(laide));
    }

    public static String twoSort(String[] s) {
        String smallest = s[0];
        for (String t : s) {
            if (t.compareTo(smallest) < 0) {
                smallest = t;
            }
        }
        StringBuilder result = new StringBuilder();
        for (int j = 0; j < smallest.length(); j++) {
            if (j > 0) {
                result.append("***");
            }
            result.append(smallest.charAt(j));

        }
        return result.toString();

    }

    public static String twoSort2(String[] s) {
        String smallest = s[0];
        for (String t : s) {
            if (t.compareTo(smallest) < 0) {
                smallest = t;
            }
        }
        //return smallest.replaceAll("([a-zA-Z])", "***$1").substring(3);
        return String.join("***", smallest.split(""));

    }
}
