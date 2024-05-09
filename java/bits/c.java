package bits;

public class c{
    public static void lastbits(int n,int i)
    {
        int bitMask=(~(0)<<i);
        n=(n & bitMask);
        System.out.println(n);
    }
    public static void main(String[] args) {
        lastbits(15, 2);
    }
}