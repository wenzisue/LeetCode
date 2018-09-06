/*
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of
 * their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * 
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * 
 * Example:
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class AddTwoNums {
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
	
	public static ListNode addTwoNumsImpl(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(0);
		ListNode ln = dummyHead;
		int carry = 0;
		int sum = 0;
		
		while(l1 != null || l2 != null) {
			sum = carry + ((l1 != null)?l1.val:0) + ((l2 != null)?l2.val:0);
            carry = sum / 10;
            sum = sum % 10;
			
			ln.next = new ListNode(sum);
			ln = ln.next;

			if(l1 != null) l1 = l1.next;
			if(l2 != null) l2 = l2.next;
		}
		
		if(carry == 1)
			ln.next = new ListNode(carry);
		
		return dummyHead.next;
	}
	
	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(3);
		l1.next.next = new ListNode(9);
		l1.next.next.next = null;
		
		
		ListNode l2 = new ListNode(3);
		l2.next = new ListNode(4);
		l2.next.next = new ListNode(7);
		l2.next.next.next = null;
		
		ListNode l3 = addTwoNumsImpl(l1, l2);
		
		ListNode pl = l3;
		while(pl != null)
		{
			System.out.print(pl.val + " ");
			pl = pl.next;
		}

	}

}
