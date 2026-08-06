void main() {
    System.out.println(reverseString("hello"));
}
public static String reverseString(String s) {
    if(s.isEmpty()){
        return "";
    }
    return reverseString(s.substring(1)) +  s.charAt(0) ;
}