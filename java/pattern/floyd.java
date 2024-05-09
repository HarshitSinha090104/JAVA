package pattern;

public class floyd {
    public static void floydt(int rows,int columns){
        int a=1;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(a);
                System.out.print(" ");
                a++;
            }
            System.out.println();
        }
        }
        public static void main(String[] args) {
            floydt(6, 6);
        }
    
}
