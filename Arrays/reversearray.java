package ARRAYS;

public class reversearray {
    public static void reverse(int nums[])
    {
        int first = 0,end =nums.length-1;

        while(first<end)
        {
           int  temp =  nums[end];
           nums[end]=nums[first];
           nums[first]=  temp;

           first++;
           end--;
        }
    }
    public static void main(String[] args) {
        int nums[]={2,4,6,8,10};

        reverse(nums);
        for(int i =0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");

        }
        
    }
}
