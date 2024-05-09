package twodarray;

public class optimumdiagonal {
    public static int ds(int numbers[][])
    {
        int n=numbers.length;
      
        int sum=0;
        for(int i=0;i<n;i++)
        {
            //primary diagonal
              sum+=numbers[i][i];

              //secoindary diagonal
              if(i!=n-i-1)
              {
                sum+=numbers[i][n-i-1];
              }


        }
        return sum;
    }
    public static void main(String[] args) {
        int numbers[][]={{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1}};
        int sum=ds(numbers);
        System.out.println(sum);
    }
}
