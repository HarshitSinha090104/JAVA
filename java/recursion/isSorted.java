

public class isSorted {
    public static boolean check(int numbers[],int i){
        if(i==numbers.length-1){
            return true;
        }
        if(numbers[i]>numbers[i+1]){
            return false;
        }
        return check(numbers, i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,25,5};
        System.out.println(check(arr, 0));
    }
}
