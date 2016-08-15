package com.interview.leetcode.binarysearch;

import junit.framework.TestCase;

/**
 * Created_By: stefanie
 * Date: 14-11-29
 * Time: 下午3:17
 */
public class SearchTwoSortedArrayTest extends TestCase {
    SearchTwoSortedArray finder = new SearchTwoSortedArray();
    public void testFindMedianSortedArrays() throws Exception {
        int[] A = new int[]{4,5,6,8,9};
        int[] B = new int[]{};
        assertEquals(6.0, finder.findMedian(A, B));

    }
}
