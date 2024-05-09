package string_in_java;

public class shortestpath {
    public static float shortest(String str){
        int x=0;
        int  y=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='N')
            {
                y++;
            }
            else if(str.charAt(i)=='S')
            {
                y--;
            }
            else if(str.charAt(i)=='E')
            {
                x++;
            }
            else if(str.charAt(i)=='W')
            {
                x--;
            }

        }
        float z=(float)Math.sqrt(x*x+y*y);
        return z;

    }
    public static void main(String[] args) {
        String str=new String("EEENNNN");
        float a=shortest(str);
        System.out.println(a);

        }
    
}
