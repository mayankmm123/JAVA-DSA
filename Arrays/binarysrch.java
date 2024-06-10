package ARRAYS;
import java.util.*;
public class binarysrch {
    public static int binsrch(int nums[],int key)
    {
        int start =0;
        int end = nums.length-1;

        while(start<=end)
        {
        int mid = (start + end)/2;
        if(nums[mid] == key)
        {return mid;}

       else if(nums[mid]<key)
        {
            start = mid+1;
        }
        else
        {
            end = mid-1;
        }
        }

        return -1;

    }
    public static void main(String[] args) {
        int nums[]={2,4,6,8,3,5,7};
        int key = 5;
        System.out.println("key is at"+binsrch(nums, key));
    }
}




























//// prerequistie is sorted array 