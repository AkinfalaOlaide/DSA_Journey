void main() {
    System.out.println(fibonacci(3));
}
public static int fibonacci(int n) {
    if(n == 0) return 0;
    if(n == 1) return 1;
    return  fibonacci(n-1) + fibonacci(n-2);
} // time complexity is O(2^n) and space complexity is O(n)