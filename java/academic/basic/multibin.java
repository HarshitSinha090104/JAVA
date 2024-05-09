package academic.basic;

public class multibin {
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
      public static int decimal(int decNo)
      {
          int pow=0;
          int bin=0;
          while(decNo!=0)
          {
              int r=decNo%2;
              bin=bin+(r*(int)Math.pow(10,pow));
              decNo=decNo/2;
              pow++;
  
          }
          return bin;
      }
      public static void main(String[] args) {
        int a=10;
        int b=11;
        int c=bintodec(a);
        int d=bintodec(b);
        System.out.println(decimal(c*d));
      }
    
}
