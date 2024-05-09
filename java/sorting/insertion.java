package sorting;

public class insertion {
    public static void sort(int numbers[])
    {
      for(int j=1;j<numbers.length;j++)
      {
        int key =numbers[j];
        int i=j-1;
        while(i>-1&&numbers[i]>key)
        {
            numbers[i+1]=numbers[i];
            i=i-1;
        }
        numbers[i+1]=key;
      }
      for(int i=0;i<numbers.length;i++)
      {
        System.out.print(numbers[i]+" ");
      }
    }
    public static void main(String args[]){
               int arr[]={5,8,4,30};
               sort(arr);

    }


}
