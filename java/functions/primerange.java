package functions;

public class primerange {
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
    public static void prime_rang(int n)
    {
        for(int i=2;i<n;i++)
        {
            if(isPrime(i))
            {
               System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        prime_rang(10);

    }
    
}
