void main() {
   countDown(5);
}
public static void countDown(int n){
    if(n ==0 ){
        return;
    }
    countDown(n-1);
    System.out.println(n);
}