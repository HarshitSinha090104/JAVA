

public class firstocc {

    public static int f(int numbers[],int key,int i){
        if(i==numbers.length-1)
        {
            return -1;
        }
        if(numbers[i]==key)
        {
            return i;
        }
        return f(numbers, key, i+1);

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        System.out.println(f(arr, 40, 0));
    }
    
}
