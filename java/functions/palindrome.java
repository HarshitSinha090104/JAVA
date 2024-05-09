package functions;

public class palindrome {
    public static int reverse(int n)
    {
        int s=0;
        while(n!=0)
        {
            int r=n%10;
            s=s*10+r;
            n=Math.floorDiv(n, 10);
        }
        return s;
    }
    public static boolean checkPalindrome(int n)
    {
        int a=n;
        if(a==reverse(n))
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(checkPalindrome(135));
    }
    
}
