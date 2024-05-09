public class bintodec {
    public static int bitode(int n)
    {
        int s=0;
        int pow=0;
        while(n!=0)
        {
            int r=n%10;
            s=s+(r*(int)Math.pow(2,pow));
            n=n/10;
            pow++;
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println(bitode(101));
    }
    
}
