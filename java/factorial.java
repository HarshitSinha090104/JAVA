import java.util.*;

public class factorial {
    public static void main(String[] args) {
        int fact=1;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the no : ");
        int n=sc.nextInt();
        int a=n;
        while(n>0)
        {
            fact=fact*n;
            n--;
        }
            System.out.print("factorial of "+a+" is "+fact);

    }
    
}
