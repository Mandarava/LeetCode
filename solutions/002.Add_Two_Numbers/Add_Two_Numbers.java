/* Definition for singly-linked list. */
class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

/* add numbers to the list */
class addNode {
	public ListNode add(int... a) {
		ListNode head = new ListNode(a[0]);
		ListNode temp = null;
		ListNode curr = null;
		for (int i = 1; i < a.length; i++) {
			temp = new ListNode(a[i]);
			if (1 == i) {
				head.next = temp;
			} else {
				curr.next = temp;
			}
			curr = temp;
		}

		return head;
	}
}

class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode head = new ListNode(-1);
		ListNode pre = head;
		int value = 0;
		int carry = 0; // 进位
		for (; l1 != null || l2 != null; pre = pre.next, l1 = l1 == null ? null
				: l1.next, l2 = l2 == null ? null : l2.next) {

			value = ((l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry) % 10; // 如果是空指针则值为0
			carry = ((l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry) / 10;
			pre.next = new ListNode(value);
		}
		// 判断最高位是否有进位，有则增加一个节点
		if (carry > 0) {
			pre.next = new ListNode(carry);
		}
		return head.next;
	}
}

public class Main {
	public static void main(String[] args) {
		ListNode l1 = new addNode().add(1, 8);
		ListNode l2 = new addNode().add(0);

		ListNode result = new Solution().addTwoNumbers(l1, l2);
		while (null != result) {
			System.out.print(result.val + ",");
			result = result.next;
		}

	}
}