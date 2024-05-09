package CLASS;

public class pub{
    public static void main(String[] args) {
        pen p= new pen();
        p.setColor("blue");
        
    }
}
    class pen{
         String color;
         int tip;
        void setColor(String col)
        {
            this.color=col;
        }
        void settip(int tip)
        {
            this.tip=tip;//this keyword refers to current object and can be used to differentite between property an variables
        }
     }
    

