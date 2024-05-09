package functions;

public class prime {
    public static boolean isPrime(int n)
    {
        boolean p=true;
        if(n==2)
        {
            return true;
        }
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                p=false;
            }
        }
        return p;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(5));
    }
    
}
