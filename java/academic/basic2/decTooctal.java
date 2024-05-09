package academic.basic2;

public class decTooctal {
    public static void dectooct(int n){
        char arr[]={'0','1','2','3','4','5','6','7'};
        String s="";
        while(n>0)
        {
            int r=n%8;
            s+=arr[r];
            n=n/8;


        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        dectooct(15);
    }
}
