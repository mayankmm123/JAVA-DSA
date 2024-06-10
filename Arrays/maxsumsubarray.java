package ARRAYS;
import java.util.*;
public class maxsumsubarray {
    public static void maxsubarraysum(int[]nums)
    {
    int maxsum= Integer.MIN_VALUE;
    int currsum =0;

    for(int i =0;i<nums.length;i++)
    {
        for(int j=i;j<nums.length;j++)
        {
            currsum=0;
            for(int k =i;k<=j;k++)
            {
               currsum+=nums[k];


            }
            System.out.println(currsum);
            if(maxsum<currsum)
            {maxsum=currsum;}
        }

        }
                                       System.out.println("max sum is" + maxsum);

    }
    

    public static void main(String args[])
    {
        int nums[]={2,4,6,8,10};
        maxsubarraysum(nums);

    }


        
    }
