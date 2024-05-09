package array;
import java.util.*;
public class kadan {
    public static int kad(int numbers[])
    {
        int curr_sum=0;
        int max_sum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]>0||curr_sum!=0)
            {
                curr_sum+=numbers[i];
               Math.max(curr_sum,max_sum);
            }
        }
        return max_sum;
    }
    public static void main(String[] args) {
        int arr[]=new int[8];
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<8;i++)
        {
            arr[i]=scan.nextInt();
        }
        scan.close();
        System.out.println();
        System.out.println("Required sum  is");
       int a=kad(arr);
       System.out.println(a);
        
    }
}
