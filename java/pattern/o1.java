package pattern;

public class o1 {
    public static void o1(int rows,int columns)
    {
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<i;j++)
            {
                if((i+j)%2!=0)
                {
                    System.out.print(1);

                }
                else
                System.out.print(0);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        o1(4,5);
    }
    
}
