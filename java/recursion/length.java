public class length {
    public static int len(String s,int si){
        int a=0;
        if(si==s.length()){
            return a;
        }
        a=1+len(s, si+1);
        return a;
    }
    public static void main(String[] args) {
        String st="";
        System.out.println(len(st, 0));
    }
}
