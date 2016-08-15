package com.interview.leetcode.dp;

import junit.framework.TestCase;

/**
 * Created_By: stefanie
 * Date: 14-11-25
 * Time: 下午9:33
 */
public class KSumTest extends TestCase {
    public void testFind() throws Exception {
        TwoSequenceDP.KSum finder = new TwoSequenceDP.KSum();
        int[] nums = new int[]{1,3,4,5,8,10,11,12,14,17,20,22,24,25,28,30,31,34,35,37,38,40,42,44,45,48,51,54,56,59,60,61,63,66};
        assertEquals(453474, finder.find(nums, 24, 842));
    }
}
