import java.util.*;

public class p3 {
    public static void main(String[] args) {
        Scanner a= new Scanner(System.in);
        float pen=a.nextFloat();
        float pencil=a.nextFloat();
        float eraser=a.nextFloat();
        float bill = pen+pencil+eraser;
       float  total_bill=(bill*(18/100));
    System.out.println(total_bill);

    }
    
}
