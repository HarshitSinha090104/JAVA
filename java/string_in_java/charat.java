package string_in_java;

public class charat {
    public static void sc(String str)
    {
        for(int i=0;i<str.length();i++)
        {

            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {
        String str=new String("Harshit");
        sc(str);
    }
    
}
