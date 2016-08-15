package com.interview.leetcode.tree;

import junit.framework.TestCase;

/**
 * Created_By: stefanie
 * Date: 14-11-22
 * Time: 下午6:32
 */
public class BSTOperationsTest extends TestCase {
    BSTOperations BSTOp = new BSTOperations();
    public void testcase(){
        BSTOperations.BSTTreeNode root = BSTOp.insert(null, 4);
        root = BSTOp.insert(root, 2);
        root = BSTOp.insert(root, 6);
        root = BSTOp.insert(root, 3);
        root = BSTOp.insert(root, 5);
        BSTOp.size(root);
        assertEquals(2, BSTOp.min(root).val);
        assertEquals(6, BSTOp.max(root).val);
        assertNull(BSTOp.exist(root, 1));
        assertNull(BSTOp.exist(root, 7));
        assertEquals(5, BSTOp.exist(root, 5).val);
        assertEquals(4, BSTOp.select(root, 2).val);
        assertEquals(2, BSTOp.select(root, 0).val);
        assertEquals(6, BSTOp.select(root, 4).val);
        assertNull(BSTOp.select(root, 7));
        assertEquals(1, BSTOp.rank(root, 3));
        assertEquals(3, BSTOp.rank(root, 5));
        assertEquals(5, BSTOp.rank(root, 7));
        assertEquals(0, BSTOp.rank(root, 0));
        assertEquals(0, BSTOp.rank(root, 2));
        assertEquals(6, BSTOp.floor(root, 6).val);
        assertEquals(6, BSTOp.floor(root, 10).val);
        assertNull(BSTOp.floor(root, 1));
        assertEquals(2, BSTOp.ceil(root, 1).val);
        assertNull(BSTOp.ceil(root, 10));
        assertEquals(3, BSTOp.ceil(root, 3).val);
//        assertEquals(4, BSTOp.successor(BSTOp.exist(root, 3)));
//        assertEquals(6, BSTOp.successor(BSTOp.exist(root, 5)));
//        assertNull(BSTOp.successor(BSTOp.exist(root, 6)));
//        assertEquals(3, BSTOp.predecessor(BSTOp.exist(root, 4)));
//        assertEquals(4, BSTOp.predecessor(BSTOp.exist(root, 5)));
//        assertNull(BSTOp.predecessor(BSTOp.exist(root, 2)));

        BSTOp.deleteMax(root);
        assertEquals(5, BSTOp.max(root).val);
        BSTOp.deleteMin(root);
        assertEquals(3, BSTOp.min(root).val);
        BSTOp.insert(root, 1);
        assertEquals(1, BSTOp.min(root).val);
        BSTOp.delete(root, 3);
        assertEquals(1, root.left.val);
        BSTOp.insert(root, 0);
        BSTOp.insert(root, 3);
        BSTOp.insert(root, 2);
        BSTOp.delete(root, 1);
        assertEquals(2, root.left.val);
        assertEquals(0, root.left.left.val);
        assertEquals(3, root.left.right.val);
    }
}
