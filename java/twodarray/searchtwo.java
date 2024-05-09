package twodarray;

public class searchtwo {
    public static void search(int numbers[][],int key)
    {
        int n=numbers.length;
        int cols=0;
        int c=0;
        int rows=numbers[0].length-1;
        while(cols<n && rows>=0)
        {
            if(numbers[rows][cols]==key)
            {
                System.out.println("Found at index "+rows+","+cols);
                c++;
            }
            if(key<numbers[rows][cols]){
                rows--;
            }
            else
            {
                cols++;
            }

        }
        if(c==0)
        System.out.println("Not found");

    }

    public static void main(String[] args) {
        
    
    int arr[][]={{1,2,3},
                {4,5,6},
                  {7,8,9}};
    search(arr, 33);
        
    }
    
}

    
