package CLASS;

public class multiinheri {
    public static void main(String[] args) {
        Rohu r=new Rohu();
        r.eats();
        r.breathe();
        r.get();
    }
    
}
class Animal{
    String color;
    void eats(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathe");
    }

}
class Fish extends Animal{
    int fins;
    void tail(String arg)
    {
        System.out.println(arg);
    }
    void str(){
        System.out.println("fishes have protien");
    }
}
class Rohu extends Fish{
     int tails;
     void get(){
        System.out.println("rohu is tasty");
     }
}


