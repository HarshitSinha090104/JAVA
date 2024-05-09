package array;
import java.util.*;
public class subarray {

    public static void subarr(int numbers[]){
        for(int i=0;i<numbers.length;i++)
        {
            for(int j=i;j<numbers.length;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(numbers[k]+" ");
                }
                
                if(j!=numbers.length-1)
                {
                    System.out.print(" , ");
                }
            }
            
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numbers[]=new int[5];
        for(int i=0;i<5;i++){
            numbers[i]=sc.nextInt();
        }
        sc.close();
        subarr(numbers);
    }

}