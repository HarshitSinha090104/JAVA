package pattern;

public class p {
    public static void hr(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<n;k++)
            {
                if(i==0||i==n-1||k==0||k==n-1)
                {
                    System.out.print("* ");
                }
                else
                System.out.print("  ");

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hr(5);
    }
    
}
