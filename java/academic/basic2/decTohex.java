package academic.basic2;
import java.util.*;
public class decTohex {
    public static void decTohexa(int n)
    {
        char arr[]={'0','1','2','3','4','5','5','6','7','8','9','A','B','C','D','E','F'};
        String hex="";
        while(n!=0){
            int r=n%16;
            hex+=arr[r+1];
            n=n/16;
        }
        System.out.println(hex);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        decTohexa(a);

    }
}
