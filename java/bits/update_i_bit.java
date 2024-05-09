package bits;

public class update_i_bit {
    public static void updateibit(int n,int i,int newbit){
        int bitMask=~(1<<i);
        n=(n & bitMask);
        newbit=(newbit<<i);
        n=(n | newbit);
        System.out.println(n);
    }    
    public static void main(String[] args) {
        updateibit(10, 0, 1);
    }


}
