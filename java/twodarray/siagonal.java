package twodarray;

public class siagonal {
    public static int es(int numbers[][]){
        int sum=0;
        int n=numbers.length;
        int m=numbers[0].length;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i==j)
                {
                    sum+=numbers[i][j];
                }
                else if(i+j==numbers.length-1)
                {
                    sum+=numbers[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int numbers[][]={{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1}};
        int sum=es(numbers);
        System.out.println(sum);

    }
    
}
