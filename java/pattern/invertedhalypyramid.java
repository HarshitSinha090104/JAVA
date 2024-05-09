package pattern;

public class invertedhalypyramid {
    public static void ihp(int rows,int columns){
         for(int i=0;i<rows;i++)
         {
            for(int j=0;j<columns-i;j++)
            {
                System.out.print(j+1);
            }
            System.out.println();
         }
    }    
    public static void main(String[] args) {
        ihp(5,5);
    }
}
