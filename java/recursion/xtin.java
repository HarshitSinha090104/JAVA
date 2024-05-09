

public class xtin {
    public static int xton(int n,int x){
        if(n==0)
        {
            return 1;
        }
        int p=x*xton(n-1, x);
        return p;
    }
    public static void main(String[] args) {
        System.out.println(xton(3, 3));
    }
}
