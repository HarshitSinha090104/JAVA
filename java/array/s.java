package array;
import java.util.*;
public class s {
    public static void su(int numbers[]){
        for(int i=0;i<numbers.length;i++)
        {
            for(int j=i;j<numbers.length;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(numbers[k]);
                }
                System.out.print(" ");
              
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner inpu=new Scanner(System.in);
        int a=inpu.nextInt();
        int arr[]={1,2,3,4,5,6};
        su(arr);

    }
    
}
