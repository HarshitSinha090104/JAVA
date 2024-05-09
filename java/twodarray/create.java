package twodarray;
import java.util.*;
public class create {
    public static void c(int numbers[][]){
        for(int i=0;i<numbers.length;i++)
        {
            for(int j=0;j<numbers.length;j++)
            {
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int arr[][]=new int[3][3];

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
               arr[i][j]=input.nextInt();

            }

            


         }
         input.close();
         c(arr);
    
}
}
