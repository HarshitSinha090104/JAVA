package functions;

public class dec {
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
        System.out.println(decimal(4));
    }
    
}
