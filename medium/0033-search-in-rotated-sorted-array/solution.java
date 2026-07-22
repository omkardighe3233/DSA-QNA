class Solution {
    public int search(int[] nums, int target) 
    {
        int n= nums.length-1;
     
     while(n>=0 || n<nums.length){
           if( nums[n/2] < target)
        {
            n--;
        }else if(nums[n/2] ==target){
            n++;
        }else{

            n= (n/2)+1;
            return n;
        }
    }
        return -1;
    }
}