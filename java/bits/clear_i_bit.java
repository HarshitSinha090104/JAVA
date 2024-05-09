package bits;

public class clear_i_bit {
    public static void clearibit(int n,int i)
    {
        int bitMask=~(1<<i);
        n=(n & bitMask);
        System.out.println(n);
    }
    public static void main(String[] args) {
        clearibit(10, 1);
    }
    
}
