package CLASS;

public class singleinheri {
    public static void main(String[] args) {
        Fish shark=new Fish();
        shark.eats();
        shark.breathe();
        shark.fins=3;
        

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
    }

