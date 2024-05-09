package CLASS;

public class bear {
    public static void main(String[] args) {
        Bear b=new Bear();
        b.green();
        b.meat();
    }
}
interface herbivore{
    void green();
}
interface carnivore{
    void meat();

}
class Bear implements herbivore,carnivore{
    public void green(){
        System.out.println("grass");
    }
    public void meat(){
        System.out.println("fish");
    }
}
