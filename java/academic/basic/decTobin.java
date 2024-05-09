package academic.basic;

import java.util.Scanner;

public class decTobin {
    public static void main(String[] args) {
        
        int pow=0;
        int bin=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        while(n!=0)
        {
            int r=n%2;
            bin=bin+(r*(int)Math.pow(10,pow));
            n=n/2;
            pow++;

        }
        System.out.println(bin);
    }
    
}
