package string_in_java;

public class st {
    public static void str(String s){
        int n=s.length();
        String arr[]=new String[ n * (n + 1) / 2];
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                 arr[j]=s.substring(i,j);
                 j++;
                 
            }
        }
    }

    
}
