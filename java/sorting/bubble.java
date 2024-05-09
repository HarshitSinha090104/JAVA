package sorting;

public class bubble {
    public static void bubblesort(int numbers[]){
        int n=numbers.length;
              for(int i=0;i<n;i++)
              {
                for(int j=0;j<n-i-1;j++){
                    if(numbers[j]>numbers[j+1]);
                    {
                        int temp=numbers[j];
                        numbers[j]=numbers[j+1];
                        numbers[j+1]=temp;

                    }

                }
            }
                for(int i=0;i<n;i++)
                {
                    System.out.print(numbers[i]+" ");
                }
              
    }
    public static void main(String[] args) {
        int numbers[]={5,4,10,3,1};
        bubblesort(numbers);


    }
    
}
