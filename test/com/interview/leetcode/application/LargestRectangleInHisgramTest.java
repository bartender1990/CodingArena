package com.interview.leetcode.application;

import junit.framework.TestCase;

/**
 * Created_By: stefanie
 * Date: 14-11-29
 * Time: 下午1:49
 */
public class LargestRectangleInHisgramTest extends TestCase {
    LargestRectangleInHisgram finder = new LargestRectangleInHisgram();
    public void testLargestRectangleArea() throws Exception {
        int[] heights = new int[]{4,2};
        assertEquals(4, finder.largestRectangleArea(heights));
    }
}
