package pattern;

public class invertedpyramid {
    public static void inverted_pyramid(int rows,int columns)
    {
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=columns-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        inverted_pyramid(4, 4);
    }
    
}
