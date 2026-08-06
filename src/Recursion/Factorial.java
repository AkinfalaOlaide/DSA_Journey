void main() {
    System.out.println(factorial(6));
}
public static long factorial(int n) {
    if(n==0){
        return 1;
    }
    return  n * factorial(n-1);
}