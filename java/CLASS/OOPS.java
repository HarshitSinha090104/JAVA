package CLASS;

public class OOPS {
    public static void main(String[] args) {
        pen p1=new pen();// object and constructor
        p1.setcolor("Blue");

        p1.settip(5);

        System.out.println(p1.getColor());//prperties can be accessed by getters and setters
        System.out.println(p1.getTip());
       // p1.color="Yellow";//due to private class this property cannot be accessed outside the defined class
       // p1.tip=7;//due to private class this property cannot be accessed outside the defined class
       p1.setcolor("Yellow");
       p1.settip(7);

 
        System.out.println(p1.getColor());
        System.out.println(p1.getTip());
    }
}
class pen{
   private String color;//this can only be accessed inside this class
    private int tip;//this can only be accessed inside this class
    void setcolor(String col)
    {
        color=col;
    }
    void settip(int n){
        tip=n;
    }
    String getColor(){
        return this.color;
    }
    int getTip()
    {
        return this.tip;
    }
}
