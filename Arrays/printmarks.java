package ARRAYS;

public class printmarks {
    public static void arr(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println("marks are"+arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]=new int[5];
        arr[2]=100;
        arr(arr);

    }
}
