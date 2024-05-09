package functions;
import java.util.*;
public class callbyvalue {
    public static void swap(int a,int b)
    {
        int t=a;
        a=b;
        b=t;
         System.out.println("inside");
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        swap(a, b);
        System.out.println("outside");
        System.out.println(a);
        System.out.println(b);
    }
    
    
}
