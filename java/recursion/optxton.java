

public class optxton {
    public static int xton(int x,int n){
        if(n==0){
            return 1;
        }
        int hp=xton(x, n/2);
        int hpx=hp*hp;
        if(n%2!=0){
            hpx=x*hpx;
        }
        return hpx;
    } 
    public static void main(String[] args) {
        System.out.println(xton(3, 3));
    }
}
