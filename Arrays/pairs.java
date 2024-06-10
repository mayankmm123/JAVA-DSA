// package ARRAYS;
// import java.util.*;

// public class pairs {
//     public static void pair(int nums[])
//     {
//         for(int i=0;i<nums.length;i++)
//         {
//           int   current = nums[i];
//             for(int j = i+1;j<nums.length;j++)
//             {
//                 System.out.print("("+current+nums[j]+")");
//             }
//             System.out.println();
//         }
        
//     }
// public static void main(String[] args) {
//     int nums[]={2,4,6,8,10};
//     pair(nums);
// }    
// }
package ARRAYS;public class pairs {
    public static void pairs(int arr[]){
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+curr+arr[j]+")");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[]={2,3,4,5,6};
        pairs(arr);
    }
}