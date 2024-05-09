

public class dec {
    public static void decs(int n){
        if(n==1)
        {
            System.out.print(1);
        }
        else{
            System.out.print(n);
            System.out.print(" ");
            decs(n-1);
        }
    }
    public static void main(String[] args) {
        decs(10);
    }
    
}
