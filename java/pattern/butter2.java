package pattern;
import java.util.*;
public class butter2 {
    public static void butter(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int k=1;k<=2*(n-i);k++)
            {
                System.err.print(" ");

            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int k=1;k<=2*(n-i);k++)
            {
                System.out.print(" ");

            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
           Scanner input=new Scanner(System.in);
           System.out.print("Enter a no  : ");
           int a=input.nextInt();
           input.close();
           butter(a);
    }
    
}
