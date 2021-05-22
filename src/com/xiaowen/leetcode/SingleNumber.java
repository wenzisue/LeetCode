package com.xiaowen.leetcode;

/*
Given an integer array nums where every element appears three times except for one, which appears exactly once. Find the single element and return it.

You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:

Input: nums = [2,2,3,2]
Output: 3
Example 2:

Input: nums = [0,1,0,1,0,1,99]
Output: 99
 
Constraints:

1 <= nums.length <= 3 * 104
-231 <= nums[i] <= 231 - 1
Each element in nums appears exactly three times except for one element which appears once.

 */

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
	public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        int result = 0;
       
        for(int num: nums) {
            if(map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        	if(entry.getValue() == 1) {
        		result = entry.getKey();
        		break;
        	}
        }
        
        return result;
    }
	
	public static void main(String[] args) {
		int[] nums = {2,2,3,2};
		
		int result = singleNumber(nums);
		
		System.out.println(result);
	}

}
