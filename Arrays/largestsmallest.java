package ARRAYS;
import java.util.*;
public class largestsmallest {
    public static int largesmall(int nums[])
    {
        int LARGEST = Integer.MIN_VALUE;
        int SMALLEST = Integer.MAX_VALUE;

        for(int i=0; i<nums.length;i++)
        {
            if(LARGEST<nums[i])
            {LARGEST=nums[i];}
            if(SMALLEST>nums[i])
            {SMALLEST=nums[i];}

        }
                    System.out.println("smallest is"+SMALLEST);

        return LARGEST;
    }
    public static void main(String[] args) {
        int nums[]={2,3,4,5,6};
        System.out.println("largest is "+largesmall(nums));

    }
}
