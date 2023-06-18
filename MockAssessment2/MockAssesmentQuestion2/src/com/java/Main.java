package com.java;


public class Main {
	public class ListNode {
	    int val;
	    ListNode next;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0); // Dummy head node
        ListNode current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
        }

        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        return dummy.next; // Return the head of the resulting linked list
    }

    public static void main(String[] args) {
        Main solution = new Main();

        // Example 1
        ListNode l1 = solution.new ListNode(2);
        l1.next = solution.new ListNode(4);
        l1.next.next = solution.new ListNode(3);

        ListNode l2 = solution.new ListNode(5);
        l2.next = solution.new ListNode(6);
        l2.next.next = solution.new ListNode(4);

        ListNode result = solution.addTwoNumbers(l1, l2);
        printLinkedList(result); // Output: [7, 0, 8]

        // Example 2
        l1 = solution.new ListNode(0);
        l2 = solution.new ListNode(0);

        result = solution.addTwoNumbers(l1, l2);
        printLinkedList(result); // Output: [0]

        // Example 3
        l1 = solution.new ListNode(9);
        l1.next = solution.new ListNode(9);
        l1.next.next = solution.new ListNode(9);
        l1.next.next.next = solution.new ListNode(9);
        l1.next.next.next.next = solution.new ListNode(9);
        l1.next.next.next.next.next = solution.new ListNode(9);
        l1.next.next.next.next.next.next = solution.new ListNode(9);

        l2 = solution.new ListNode(9);
        l2.next = solution.new ListNode(9);
        l2.next.next = solution.new ListNode(9);
        l2.next.next.next = solution.new ListNode(9);

        result = solution.addTwoNumbers(l1, l2);
        printLinkedList(result); // Output: [8, 9, 9, 9, 0, 0, 0, 1]
    }

    // Helper method to print the elements of a linked list
    private static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
