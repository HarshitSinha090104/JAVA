package divideandconquer;



public class ser {
    public static int search(int numbers[],int si,int ei,int target){
        if(si>ei){
            return -1;
        }
       int mid=si+(ei-si)/2;
       if(numbers[mid]==target){
           return mid;
       }
       if(numbers[si]<numbers[mid]){
        if(numbers[si]<=target && target<=numbers[mid]){
            return search(numbers, si, mid-1, target);
        }
        else{
            return search(numbers, mid+1, ei, target);
        }
       }
       else{
        if(numbers[mid]<=target && numbers[ei]>=target){
            return search(numbers, mid+1, ei, target);

        }
        else{
            return search(numbers, si, mid-1, target);
        }
       }

    }
    public static void main(String[] args) {
        int numbers[]={4,5,6,7,0,1,2};
        int target=0;
        int targidx=search(numbers, 0, numbers.length-1,target);
        System.out.print(targidx);

    }
}