class Solution {
    public boolean isMonotonic(int[] nums) 
    {
        int l=0;
        int r= nums.length-1;
       
       if(nums[l]<nums[r])
       {
        while(l<r)
        {
           if(nums[l]> nums[r])
           {
           return false; 
           }
           else{
            l++;
           }
        }
        return true;

       }
       else if( nums[l] > nums[r] ){
        while(l<r)
        {
           if(nums[l] < nums[r])
           {
           return false; 
           }else{
            l++;
           }
        }
        return true;
       }
        return true;
    }
}