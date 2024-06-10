package ARRAYS;

import java.util.*;
public class linearsearch
{
    public static int linrsrch(int[]nums,int key)
    {
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i]==key)
            {return i;}
        }
         return -1;
    }
    public static void main(String[] args) {
        int nums[]={2,4,6,8,3,5,7,9};
        int key =9;

        int index = linrsrch(nums, key);
        System.out.println("index is "+index);
    }
}