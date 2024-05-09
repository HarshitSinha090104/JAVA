

public class fact {
    public static int fac(int n){
        if(n==0||n==1){
            return 1;
        }
        else{
            int a= n*fac(n-1);
            return a;
        }

    }
    public static void main(String[] args) {
        System.out.println(fac(4));
    }
}
