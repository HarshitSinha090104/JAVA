package sorting;

public class selection {
    public static void selectionsort(int numbers[]){
        for(int i=0;i<numbers.length-1;i++)
        {
            int minpos=i;
            for(int j=i+1;j<numbers.length;j++)
            {
                if(numbers[minpos]>numbers[j])
                {
                    minpos=j;
                }
            }
            int temp=numbers[i];
            numbers[i]=numbers[minpos];
            numbers[minpos]=temp;
        }
        for(int i=0;i<numbers.length;i++)
        {
            System.out.print(numbers[i]+" ");
        }
      
}
public static void main(String[] args) {
int numbers[]={5,4,10,3,1};
selectionsort(numbers);


}

}
