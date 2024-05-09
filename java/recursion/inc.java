

public class inc {
    public static void incs(int n){
        
        if(n==1)
        {
            System.out.print(1+" ");
            return;
        }
        else{
            incs(n-1);
            System.out.print(n+" ");
           
        }

    }
    public static void main(String[] args) {
        incs(10);
    }
}
