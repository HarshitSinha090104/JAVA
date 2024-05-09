package bits;

public class oddeven {
    public static void odd_even(int n){
        int bitMask=1;
        if((n & bitMask)==1){
                 System.out.println("Odd number");

        }
        else{
            System.out.println("Even number");
        }

    }
    public static void main(String[] args) {
        odd_even(1);
        odd_even(4);
    }
    
}
