public class alloccur {
    public static void alloc(int numbers[],int key,int index){
        if(index==numbers.length){
            return;
        }
        if(numbers[index]==key){
            System.out.print(index+" ");
        }
        alloc(numbers, key, index+1);
    }
    public static void main(String[] args) {
        int numbers[]={1,2,4,5,3,2,5,3,6,1,7,4,2,5};
        alloc(numbers, 2, 0);

    }
}
