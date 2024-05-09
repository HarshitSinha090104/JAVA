


public class fib {
    public static int fibs(int n){
        if(n==0||n==1){
            return n;
        }
        int f1=fibs(n-1);
        int f2=fibs(n-2);
        int f=f1+f2;
        return f;
    }
    public static void main(String[] args) {
        System.out.println(fibs(25 ));
    }
}
