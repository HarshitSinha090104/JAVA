package CLASS;
public class interference{
    public static void main(String[] args) {
        Queen q=new Queen();
        q.moves();

    }
}
interface chess{
    void moves();
}

class Queen implements chess{
  public  void moves(){
        System.out.println("left,right");
    }
}
class rook implements chess{
    public void moves(){
             System.out.println("up,down");
    }
}

