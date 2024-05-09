package CLASS;

public class overidding {
  public static void main(String[] args) {
    Horse m=new Horse();
    Animal A=new Animal();
    A.eats();
    m.eats();
  }  
}

class Animal{
    void eats(){

        System.out.println("animal eats");
    }
}
class Horse extends Animal{
    void eats(){
        System.out.println("Horse eats");
    }
}