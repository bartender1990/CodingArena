package com.interview.leetcode.tree;

import com.interview.leetcode.utils.TreeNode;
import junit.framework.TestCase;

import java.util.Arrays;

/**
 * Created_By: stefanie
 * Date: 14-11-17
 * Time: 下午3:04
 */
public class TreeOperationsTest extends TestCase {
    public void testUpsideDownBinaryTree() throws Exception {
        TreeNode t2 = new TreeNode(2);
        t2.left = new TreeNode(4);
        t2.right = new TreeNode(5);
        TreeNode t1 = new TreeNode(1);
        t1.left = t2;
        t1.right = new TreeNode(3);

        TreeNode root = TreeOperations.upsideDown(t1);
        assertEquals(4, root.val);
        assertEquals(5, root.left.val);
        assertEquals(2, root.right.val);
        assertNull(root.left.left);
        assertNull(root.left.right);
        assertEquals(1, root.right.right.val);
        assertEquals(3, root.right.left.val);
        assertNull(root.right.left.left);
        assertNull(root.right.left.right);
        assertNull(root.right.right.left);
        assertNull(root.right.right.right);
    }

    public void testBST2LinkedList(){
        TreeConstruction.SortedArrayBuilder builder = new TreeConstruction.SortedArrayBuilder();
        TreeConstruction.BSTFatternMinMax fatterner = new TreeConstruction.BSTFatternMinMax();
        int[] array = new int[]{84, 75, 25, 4, 6, 29, 82, 95, 19, 9, 93};
        Arrays.sort(array);
        TreeNode root = builder.sortedArrayToBST(array);
        root = fatterner.fattern(root);
        TreeNode node = root;
        while(node != null){
            System.out.println(node.val);
            node = node.right;
        }

        System.out.println("SECOND");

        TreeConstruction.BSTFattern fattern2 = new TreeConstruction.BSTFattern();
        root = builder.sortedArrayToBST(array);
        root = fattern2.fattern(root);
        node = root;
        while(node != null){
            System.out.println(node.val);
            node = node.left;
        }

//        node = node.node1;
//        while(node.node1 != null){
//            System.out.println(node.value);
//            node = node.node1;
//        }
    }
}
