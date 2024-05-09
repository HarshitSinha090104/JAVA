package bits;

public class clearinrange {
    public static void clr(int n,int i,int j)
    {
        int a=(~(0)<<(j+1));
        int b=(1<<i)-1;
        int bitMask=a|b;
        n=(n & bitMask);
        System.out.println(n);
    }
    public static void main(String[] args) {
        clr(31, 1, 3);
    }
}
