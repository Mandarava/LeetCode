public class Solution {
	public static void main(String[] args) {
		Solution sl = new Solution();
		ListNode ret = sl.removeNthFromEnd(sl.addNode(1), 1);
		while (ret != null) {
			System.out.println(ret.val);
			ret = ret.next;
		}
	}

	/* Definition for singly-linked list. */
	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	/* make test node */
	public ListNode addNode(int... a) {
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

	public ListNode removeNthFromEnd(ListNode head, int n) {
		int length = getLength(head);
		if (n > length || n < 1) {
			return null;
		}
		if (n == length) {
			return head.next;
		}
		ListNode p = head;
		ListNode q = head;
		for (int i = 0; i < length - n + 1; i++) {
			q = q.next;
		}
		for (int i = 0; i < length - n - 1; i++) {
			p = p.next;
		}
		p.next = q;
		return head;

	}

	public int getLength(ListNode head) {
		int length = 0;
		while (head != null) {
			length++;
			head = head.next;
		}
		return length;
	}

}