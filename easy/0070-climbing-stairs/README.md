# Climbing Stairs

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

 
Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps


Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step


 
Constraints:


	1 <= n <= 45

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.2 MB  
**Submitted:** 2026-07-17T11:08:12.937Z  

```java
class Solution {
    public int lengthOfLastWord(String s) 
    {
       s = s.trim();

    if(s.length()==0 || s.length()==1 ) return s.length();
       int i = s.length()-1;
       int count = 0;
       char ch = ' ';
      while(s.charAt(i) != ch)
      {
            i--;
            count++;
            if(i==-1)
            {
                return count;
            }
      }
      return count;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/climbing-stairs/)