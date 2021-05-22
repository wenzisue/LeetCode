package com.xiaowen.leetcode;

import java.util.HashMap;

/*
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * 
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 * 
 */


public class TwoSum {
	public static int [] twoSumImpl (int[] nums, int target) {
		int[] twoNumIndexArr = {-1, -1};
		HashMap<Integer, Integer> map  = new HashMap<Integer, Integer>(); 
		
		for(int i =0; i < nums.length; i++) {
			if(map.containsKey(target - nums[i])) {
				twoNumIndexArr[0] = i;
				twoNumIndexArr[1] = map.get(target - nums[i]);
				return twoNumIndexArr;
			} else {
				map.put(nums[i], i);
			}
		}
		return twoNumIndexArr;
	}
	
	
	public static void main(String[] args) {
		int[] nums = {2, 7, 11, 12, 3};
		int target = 15;
		
		int[] resultTwoNumIndex = twoSumImpl(nums, target);
		
		System.out.println(resultTwoNumIndex[0] + ", " + resultTwoNumIndex[1]);
	}
}
