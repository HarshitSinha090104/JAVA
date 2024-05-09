

public class tiling {
    public static int til(int n){
        if(n==0||n==1)
        {
            return 1;
        }
        int fn1=til(n-1);//vertical
        int fn2=til(n-2);//horizontal
        int tw=fn1+fn2;
        return tw;
    }
    public static void main(String[] args) {
        System.out.println(til(4));
    }
    
}
