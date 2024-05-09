package array;
import java.util.*;
public class Linear {
public static  int linear_search(int arr[],int key){
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]==key)
        {
            return i;
        }
    }
    return -1;
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
    int ls=linear_search(marks, 95);
    if(ls==-1)
    {
        System.out.print("NOT FOUND");
    }
    System.out.println("FOUND AT "+(ls+1));
}
}