package ARRAYS;

public class practice {
    public static int binsrch(int arr[],int key){
        int start=0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
                start = mid+1;

            }
            else{
                end = mid-1;
            }


        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[]={2,3,45,6};
        int key = 45;
        System.out.println("key is "+binsrch(arr, key));

    }
}
