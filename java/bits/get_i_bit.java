package bits;

public class get_i_bit {
    public static void getibit(int n,int i)
    {
        int bitMask=(1<<i);
        if((n&bitMask)==0)
        {
            System.out.println("0");
        }
        else{
            System.out.println("1");
        }
    }
    public static void main(String[] args) {
        getibit(10, 0);
    }
}
