package com.xiaowen.leetcode;

import java.util.HashMap;
import java.util.Map;

public class FirstUnitChar {
	public static int firstUniqChar1(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int index = -1;        
        int pos = 0;
       
        for(char c: s.toCharArray()) {
            if(map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        
        for(char c: s.toCharArray()) {
            if(map.get(c) == 1) {
                index = pos;
        		break;
        	}
            pos++;
        }
        
        return index;
        
    }
	
	public static int firstUniqChar2(String s) {
		for(int i=0; i<s.length(); i++){
            if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i)))
                return i;
        }
		
        return -1;       
    }
	
	
	public static void main(String[] args) {
		String test = "loveleetcode";
		
		int index = firstUniqChar2(test);
		
		System.out.println(index);
	}

}
