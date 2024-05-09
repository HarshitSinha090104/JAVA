package twodarray;

public class lsearch {
    public static void search(int numbers[][],int key)
    {
        int n=numbers.length;
        int m=numbers[0].length;
        int c=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(numbers[i][j]==key)
                {
                    System.out.print("Found at index "+i+","+j);
                    c++;
                }
            }
        } 
        if(c==0)
        {
            System.out.println("Not found");
        }
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},
                       {4,5,6},
                        {7,8,9}};
        search(arr, 11);
    }
    
}
