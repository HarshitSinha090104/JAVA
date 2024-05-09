package bits;

public class power2 {
    public static void power(int n)
     {
        if((n & n-1)==0)
        {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
     }
     public static void main(String[] args) {
        power(16);
     }
    
}
