package functions;

public class bin {
    public static int bintodec(int n)
    {
        int s=0;
        int a=0;
      while(n!=0)
      {
        int r=n%10;
        int b=(int)Math.pow(2,a);
        s=s+r*b;
        n=Math.floorDiv(n, 10);
        a++;
    }    
    return s; 
        
      }     
      public static void main(String[] args) {
        System.out.println(bintodec(10011));
      }
    }