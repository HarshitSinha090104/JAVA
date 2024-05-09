package academic.basic2;

public class binTohex {
    public static void bintohex(int n){
        int hex=0;
        int a=0;
        while(n!=0){
            int r=n%10;
            int b=(int)Math.pow(16,a);
            hex+=r*b;
            a++;
            n=n/10;

        }
        System.out.println(hex);

    }
    public static void main(String[] args) {
        bintohex(1101);
    }
}
