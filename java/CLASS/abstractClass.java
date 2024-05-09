package CLASS;

public class abstractClass {
    public static void main(String[] args) {
        Horses h=new Horses();
        h.eats();
        h.walk();
        
        chicken chick=new chicken();
        chick.eats();
        chick.walk();
 

    } 
}
 abstract class Animals{
    
    void eats(){
        System.out.println("animal eats");
    }
 abstract void walk();
}

class Horses extends Animals{

       void walk(){
        System.out.println("Horse walks on 4 legs");
       }
}
class chicken extends Animals{
    void walk()
    {
        System.out.println("chicken walks on 2 legs");
    }
}
