package ARRAYS;
public class subarrays{
    public static void subar(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.println(arr[k]);
                }
                System.out.println();
            }
           
        }
        
        
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        subar(arr);
    }
}