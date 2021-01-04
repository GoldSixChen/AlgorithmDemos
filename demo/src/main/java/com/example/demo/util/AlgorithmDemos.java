package com.example.demo.util;

public class AlgorithmDemos {
	public static void main(String[] args) {
//		String s = "abcbanca";
//		System.out.println(s.indexOf('x'));
//		System.out.println(firstUniqChar(s));
		int nums[] = { 2, 7, 11, 15 };
		int target = 17;
		int num[] = twoSum(nums, target);
		// System.out.println(num.length);
		ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
		ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
		addTwoNumbers(l1,l2);
	}

	private static int firstUniqChar(String s) {
		int result = s.length();
		for (char c = 'a'; c <= 'z'; c++) {
			int firstIndex = s.indexOf(c);
			int lastIndex = s.lastIndexOf(c);
			if (lastIndex == firstIndex && firstIndex != -1) {
				result = Math.min(firstIndex, result);
			}
		}
		if (result != s.length()) {
			return result;
		}
		return -1;
	}

	public static int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = nums.length - 1; j > i; j--) {
				if (nums[i] + nums[j] == target) {
					int[] sz = { i, j };
					return sz;
				}
			}
		}
		return null;
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
		int over=0;
		ListNode result=new ListNode(0);
		ListNode root = result;
		while (l1 != null || l2!= null || over!=0) {
				int val1=(l1!=null)?l1.val:0;
				int val2=(l2!=null)?l2.val:0;
				int num=(val1+val2+over)%10;
				over=(val1+val2+over)/10;
				root.next=new ListNode(num);
				root=root.next;
				l1=(l1!=null)?l1.next:null;
				l2=(l2!=null)?l2.next:null;
			}
		return result.next;
	}
	
}
