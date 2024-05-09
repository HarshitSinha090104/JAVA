package bits;

public class countset {
    public static void counts(int n)
    {
        int count=0;
        int a;
        while(n!=0)
        {
            a=(n & 1);
            if(a==1)
            {
                count++;
            }
            n=(n>>1);

        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        counts(5);
    }
}
