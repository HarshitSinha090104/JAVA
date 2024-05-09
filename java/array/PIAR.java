package array;
import java.util.*;
public class PIAR {

    public static void pair(int numbers[]){
        for(int i=0;i<numbers.length;i++)
        {
            for(int j=i+1;j<numbers.length;j++)
            {
               System.out.print(numbers[i]+","+numbers[j]+"   ");
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
        pair(numbers);
    }
}