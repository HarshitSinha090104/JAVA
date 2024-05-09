package functions;

public class rev {
    public static int reverse(int n)
    {
        int s=0;
        while(n!=0)
        {
            int r=n%10;
            s=s*10+r;
            n=n/10;
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println(reverse(125));
    }
}
