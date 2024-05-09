
public class remove {
    public static void dup(String st, int index, String str,boolean mp[]){
             if(index==st.length()){
                System.out.println(str);
                return;
             }
             char currchar=st.charAt(index);
             if(mp[currchar -'a']==true){
                        dup(st, index+1, str, mp);
             }
             else{
                mp[currchar-'a']=true;
              
                dup(st, index+1, str+currchar, mp);
             }
    }
    public static void main(String[] args) {
        String s="harshitsinha";
        String str="";
        boolean arr[]=new boolean[26];
          dup(s, 0, str ,arr);
    }
    
}
