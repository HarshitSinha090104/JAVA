package array;
import java.util.*;
public class pbr {
    public static void update(int marks[],int nonchangable)
    {
        nonchangable=10;
        for(int i=0;i<marks.length;i++)
        {
            marks[i]+=1;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks[]=new int[5];
        for(int i=0;i<marks.length;i++)
        {
            int mark=sc.nextInt();
            marks[i]=mark;
        }
        sc.close();
        for(int i=0;i<marks.length;i++)
        {
            System.out.print(marks[i]);
        }
        System.out.println();
        update(marks, 5);
        for(int i=0;i<marks.length;i++)
        {
            System.out.print(marks[i]);
        }

    }
}
