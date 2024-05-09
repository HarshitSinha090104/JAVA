package functions;
import java.util.*;

public class binomial {


   
    public static int fact(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f*=i;
        }
        return f;
    }
     public static int binom(int n,int r)
    {
        int fn = fact(n);

        int b= fact(n)/(fact(r)*fact(n-r));
        return b;
    }

    public static void main(String[] args) {
        
        System.out.println(binom(6,3));
    }
    
}
