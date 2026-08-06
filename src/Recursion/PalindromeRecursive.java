void main() {
    System.out.println(palindrome("Poop"));
    System.out.println(palindrome("poop"));
}
public static boolean palindrome(String s) {
   if(s.isEmpty() || s.length() ==1) {
       return true;
   }
   if(s.charAt(0) != s.charAt(s.length()-1)) {
       return false;
   }
    return palindrome(s.substring(1,s.length()-1));
}
