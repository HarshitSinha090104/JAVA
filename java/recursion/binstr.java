

public class binstr {
    public static void Bnst(int n,int last,String str){
        if(n==0)
        {
            System.out.println(str);
            return;
        }
        Bnst(n-1, 0, str+"0");
        if(last==0)
        {
            Bnst(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        String st="";
        Bnst(3,0,st);
    }
}
