package functions;

public class digit_sum {
    public static int ds(int n)
{
    int s=0;
    while(n!=0)
    {
        int r=n%10;
        s=s+r;
        n=Math.floorDiv(n, 10);
    }
    return s;
}
public static void main(String[] args) {
    System.out.println(ds(213));
}
    
}
