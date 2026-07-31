# Arranging Coins

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.

Given the integer n, return the number of complete rows of the staircase you will build.

 
Example 1:

Input: n = 5
Output: 2
Explanation: Because the 3rd row is incomplete, we return 2.


Example 2:

Input: n = 8
Output: 3
Explanation: Because the 4th row is incomplete, we return 3.


 
Constraints:


	1 <= n <= 231 - 1

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.3 MB  
**Submitted:** 2026-07-31T14:56:00.291Z  

```java
class Solution {
    public int arrangeCoins(int n) 
    {
        for(int i = 1; i<=n ; i++)
        {
            count = count + i;
        }
        return 1;
        int count = 0;
            
            if(count>n)
            {
                return i;
            }
    }
                i = i-1;
}

```

---

[View on LeetCode](https://leetcode.com/problems/arranging-coins/)