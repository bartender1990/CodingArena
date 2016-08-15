package com.interview.leetcode.list;

import com.interview.leetcode.utils.ListNode;
import junit.framework.TestCase;

import java.util.Arrays;

/**
 * Created_By: stefanie
 * Date: 14-11-16
 * Time: 上午10:51
 */
public class ListOperationTest extends TestCase {
    public void testGetMiddle() throws Exception {
        ListNode head = ListNode.createList(new int[]{1,2,3,4});
        assertEquals(3, ListOperation.getMiddle(head).val);
        head = ListNode.createList(new int[]{1,2,3,4,5});
        assertEquals(3, ListOperation.getMiddle(head).val);
    }

    public void testReverse() throws Exception {
        ListNode head = ListNode.createList(new int[]{1,2,3,4});
        head = ListReverser.reverse(head);
        int[] expected = new int[]{4,3,2,1};
        assertList(expected, head);
    }

    public void testReverseUtilTail() throws Exception {
        ListNode head = ListNode.createList(new int[]{1,2,3,4});
        ListReverser.reverse(head.next, head.next.next, head);
        ListNode.print(head);
        int[] expected = new int[]{1,3,2,4};
        assertList(expected, head);
    }

    public void testReverseBetween() throws Exception {
        ListNode head = ListNode.createList(new int[]{1,2,3,4});
        head = ListReverser.reverseBetween(head, 1, 3);
        ListNode.print(head);
        int[] expected = new int[]{3,2,1,4};
        assertList(expected, head);
    }

    public void testInterleaving() throws Exception {
        ListNode l1 = ListNode.createList(new int[]{1,2,3,4});
        ListNode l2 = ListNode.createList(new int[]{5,6});
        ListOperation.interleaving(l1, l2);
        int[] expected = new int[]{1,5,2,6,3,4};
        assertList(expected, l1);
    }

    public void testHasCycle() throws Exception {
        ListNode head = ListNode.createList(new int[]{1,2,3,4});
        assertFalse(ListOperation.hasCycle(head));
        ListNode tail = head;
        while(tail.next != null) tail = tail.next;
        tail.next = head.next;
        assertTrue(ListOperation.hasCycle(head));
    }

    public void testDetectCycle() throws Exception {
        ListNode head = ListNode.createList(new int[]{1,2,3,4});
        ListNode tail = head;
        while(tail.next != null) tail = tail.next;
        tail.next = head.next;
        ListNode beginner = ListOperation.detectCycle(head);
        assertEquals(2, beginner.val);
    }

    public void testPartition() throws Exception {
        ListNode head = ListNode.createList(new int[]{5,2,7,8,3,6,4});
        head = ListOperation.partition(head, 4);
        ListNode.print(head);
    }

    public void testLength() throws Exception {
        ListNode head = ListNode.createList(new int[0]);
        assertEquals(0, ListOperation.length(head));
    }

    public void testSort() throws Exception {
        ListNode head = ListNode.createList(new int[]{5,2,8,1,7,3,4,3,9,2});
        head = ListSort.MergeSort.sort(head);
        ListNode.print(head);
        int[] expected = new int[]{5,2,8,1,7,3,4,3,9,2};
        Arrays.sort(expected);
        assertList(expected, head);
    }

    public void testMerge() throws Exception {
        ListNode l1 = ListNode.createList(new int[]{1,3,5,6,7});
        ListNode l2 = ListNode.createList(new int[]{2,4,5,6,8});
        ListNode merged = ListSort.MergeSort.merge(l1, l2);
        int[] expected = new int[]{1,2,3,4,5,5,6,6,7,8};
        assertList(expected, merged);
    }

    public void testReorderList() throws Exception {
        ListNode head = ListNode.createList(new int[]{1,2,3,4});
        ListOperation.reorderList(head);
        ListNode.print(head);
        int[] expected = new int[]{1,4,2,3};
        assertList(expected, head);
    }

    public void assertList(int[] expected, ListNode node){
        for(int i = 0; i < expected.length && node != null; i++){
            assertEquals(expected[i], node.val);
            node = node.next;
        }
    }
}
