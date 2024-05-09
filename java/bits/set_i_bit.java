package bits;

public class set_i_bit {
    public static void setibit(int n,int i){
        int bitMask=(1<<i);
        n= (n | bitMask);
        System.out.println(n);
    }
    public static void main(String[] args) {
        setibit(10, 0);
    }
    
}
