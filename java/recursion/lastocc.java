

public class lastocc {
    public static int lastoc(int numbers[],int i,int key){
        if(i==numbers.length){
           return -1;
        }
        int isFound=lastoc(numbers, i+1, key);
        if(numbers[i]==key && isFound==-1)
        {
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,4,7};
        System.out.println(lastoc(arr, 4, 0));
    }
    
}
