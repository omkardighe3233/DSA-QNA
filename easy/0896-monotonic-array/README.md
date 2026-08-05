# Monotonic Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

An array is monotonic if it is either monotone increasing or monotone decreasing.

An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is monotone decreasing if for all i <= j, nums[i] >= nums[j].

Given an integer array nums, return true if the given array is monotonic, or false otherwise.

 
Example 1:

Input: nums = [1,2,2,3]
Output: true


Example 2:

Input: nums = [6,5,4,4]
Output: true


Example 3:

Input: nums = [1,3,2]
Output: false


 
Constraints:


	1 <= nums.length <= 105
	-105 <= nums[i] <= 105

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 85.1 MB (beats 81.34%)  
**Submitted:** 2026-07-31T15:38:15.332Z  

```java
class Solution {
    public boolean isMonotonic(int[] nums) 
    {
        int l=0;
        int r= nums.length-1;
       
       if(nums[l]<nums[r])
       {
        while(l<r)
        {
           if(nums[l]> nums[l+1])
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
           if(nums[l] < nums[l+1])
           {
           return false; 
           }else{
            l++;
           }
        }
        return true;
       }
       else if(nums[l]==nums[r]) {
         while(l<r)
        {
           if(nums[l] != nums[r])
           {
           return false; 
           }else{
            l++;
           }
        }
        return true;
       }
        return false;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/monotonic-array/)