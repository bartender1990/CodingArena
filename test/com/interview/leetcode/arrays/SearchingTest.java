package com.interview.leetcode.arrays;

import com.interview.leetcode.binarysearch.*;
import junit.framework.TestCase;

import java.util.Arrays;

/**
 * Created_By: stefanie
 * Date: 14-11-14
 * Time: 下午2:41
 */
public class SearchingTest extends TestCase {
    public void testFind() throws Exception {
        int[] num = new int[]{1,2,3,4,5,6,7,8};
        assertEquals(-1, SearchingSortedArray.find(num, 0));
        assertEquals(-1, SearchingSortedArray.find(num, 9));
        assertEquals(4, SearchingSortedArray.find(num, 5));
        assertEquals(7, SearchingSortedArray.find(num, 8));
        assertEquals(0, SearchingSortedArray.find(num, 1));
    }

    public void testsearchLow() throws Exception {
        int[] num = new int[]{1,1,2,3,4,5,5,5,5,6,7,8};
        assertEquals(-1, SearchingSortedArrayWithDuplication.searchLow(num, 0));
        assertEquals(-1, SearchingSortedArrayWithDuplication.searchLow(num, 9));
        assertEquals(5, SearchingSortedArrayWithDuplication.searchLow(num, 5));
        assertEquals(11, SearchingSortedArrayWithDuplication.searchLow(num, 8));
        assertEquals(0, SearchingSortedArrayWithDuplication.searchLow(num, 1));
    }

    public void testsearchHigh() throws Exception {
        int[] num = new int[]{1,1,2,3,4,5,5,5,5,6,7,8};
        assertEquals(-1, SearchingSortedArrayWithDuplication.searchHigh(num, 0));
        assertEquals(-1, SearchingSortedArrayWithDuplication.searchHigh(num, 9));
        assertEquals(8, SearchingSortedArrayWithDuplication.searchHigh(num, 5));
        assertEquals(11, SearchingSortedArrayWithDuplication.searchHigh(num, 8));
        assertEquals(1, SearchingSortedArrayWithDuplication.searchHigh(num, 1));
    }

    public void testFindRange() throws Exception {
        int[] num = new int[]{1,1,2,3,4,5,5,5,5,6,7,8};
        int[] range = SearchingSortedArrayWithDuplication.searchRange(num, 0);
        assertEquals(-1, range[0]);
        assertEquals(-1, range[1]);

        range = SearchingSortedArrayWithDuplication.searchRange(num, 9);
        assertEquals(-1, range[0]);
        assertEquals(-1, range[1]);

        range = SearchingSortedArrayWithDuplication.searchRange(num, 5);
        assertEquals(5, range[0]);
        assertEquals(8, range[1]);
    }

    public void testMinInRotatedNoDup() throws Exception {
        assertEquals(1, SearchingRotatedArray.min(new int[]{1, 2}));
        assertEquals(1, SearchingRotatedArray.min(new int[]{2, 1}));
    }

    public void testMaxInRotatedNoDup() throws Exception {
        assertEquals(2, SearchingRotatedArray.max(new int[]{1, 2}));
        assertEquals(2, SearchingRotatedArray.max(new int[]{2, 1}));
        assertEquals(3, SearchingRotatedArray.max(new int[]{1, 2,3}));
        assertEquals(3, SearchingRotatedArray.max(new int[]{2, 3,1}));
    }

    public void testFindInRotatedNoDup() throws Exception {
        int[] num = new int[]{4,5,6,7,1,2,3};
        assertEquals(5, SearchingRotatedArray.find(num, 2));
        assertEquals(1, SearchingRotatedArray.find(num, 5));
        assertEquals(-1, SearchingRotatedArray.find(num, 9));
        assertEquals(-1, SearchingRotatedArray.find(num, 0));
        assertEquals(5, SearchingRotatedArray.find(num, 2));
        assertEquals(1, SearchingRotatedArray.find(num, 5));
        assertEquals(-1, SearchingRotatedArray.find(num, 9));
        assertEquals(-1, SearchingRotatedArray.find(num, 0));

        num = new int[]{4,5,1,2,3};
        assertEquals(3, SearchingRotatedArray.find(num, 2));
        assertEquals(1, SearchingRotatedArray.find(num, 5));
        assertEquals(-1, SearchingRotatedArray.find(num, 9));
        assertEquals(-1, SearchingRotatedArray.find(num, 0));
        assertEquals(3, SearchingRotatedArray.find(num, 2));
        assertEquals(1, SearchingRotatedArray.find(num, 5));
        assertEquals(-1, SearchingRotatedArray.find(num, 9));
        assertEquals(-1, SearchingRotatedArray.find(num, 0));
    }

    public void testMinInRotatedWithDup() throws Exception {
        //assertEquals(1, SearchingRotatedArray.min(new int[]{1, 2}));
        //assertEquals(1, SearchingRotatedArray.min(new int[]{2, 1}));
        assertEquals(1, SearchingRotatedArray.min(new int[]{1, 1, 2, 2, 2}));
        assertEquals(1, SearchingRotatedArray.min(new int[]{1, 2, 2, 2, 1}));
        assertEquals(1, SearchingRotatedArray.min(new int[]{2, 1, 2, 2, 2}));
        assertEquals(1, SearchingRotatedArray.min(new int[]{2, 2, 2, 1, 2}));
    }

    public void testMaxInRotatedWithDup() throws Exception {
//        assertEquals(2, SearchingRotatedArray.max(new int[]{1, 2}));
//        assertEquals(2, SearchingRotatedArray.max(new int[]{2, 1}));
        assertEquals(2, SearchingRotatedArray.max(new int[]{1, 1, 1, 2, 1}));
        assertEquals(2, SearchingRotatedArray.max(new int[]{2, 2, 1, 1, 1}));
        assertEquals(2, SearchingRotatedArray.max(new int[]{1, 2, 1, 1, 1}));
        assertEquals(2, SearchingRotatedArray.max(new int[]{1, 1, 1, 2, 1}));
    }

    public void testFindInRotatedWithDup() throws Exception {
        int[] num = new int[]{4,4,4,4,4,4,5,1,2,3,4};
        assertTrue(SearchingRotatedArray.find(num, 4) != -1);
        assertEquals(8, SearchingRotatedArray.find(num, 2));
        assertEquals(6, SearchingRotatedArray.find(num, 5));
        assertEquals(-1, SearchingRotatedArray.find(num, 9));
        assertEquals(-1, SearchingRotatedArray.find(num, 0));
        assertEquals(6, SearchingRotatedArray.find(num, 5));

        num = new int[]{4,5,1,2,3,4,4,4,4,4,4};
        assertTrue(SearchingRotatedArray.find(num, 4) != -1);
        assertEquals(3, SearchingRotatedArray.find(num, 2));
        assertEquals(1, SearchingRotatedArray.find(num, 5));
        assertEquals(-1, SearchingRotatedArray.find(num, 9));
        assertEquals(-1, SearchingRotatedArray.find(num, 0));
        assertEquals(1, SearchingRotatedArray.find(num, 5));
    }

    public void testFindInVArray() throws Exception{
        int[] array = new int[]{6,4,2,1,3,7,8,9,10};
        assertEquals(1, SearchingVArray.min(array));
        assertEquals(4, SearchingVArray.find(array, 4));
        assertEquals(7, SearchingVArray.find(array, 7));
        assertEquals(-1, SearchingVArray.find(array, 5));
        assertEquals(6, SearchingVArray.find(array, 6));
        assertEquals(-1,SearchingVArray.find(array, 11));

        array = new int[]{9,8,7,6,4,2,1,3,7,8};
        assertEquals(1, SearchingVArray.min(array));
        assertEquals(4, SearchingVArray.find(array, 4));
        assertEquals(7, SearchingVArray.find(array, 7));
        assertEquals(-1, SearchingVArray.find(array, 5));
        assertEquals(6, SearchingVArray.find(array,6));
        assertEquals(-1,SearchingVArray.find(array, 10));
    }

    public void testFindUnsortedArray() throws Exception{
        int[] array = new int[]{87, 1, 25, 23, 20, 86, 76, 92, 17, 31, 78, 56, 0, 31, 90, 88, 53, 24, 62, 26};
        assertTrue(SearchingUnsortedArray.find(array, 87));
        assertTrue(SearchingUnsortedArray.find(array, 0));
        assertTrue(SearchingUnsortedArray.find(array, 26));
        assertFalse(SearchingUnsortedArray.find(array, 32));
    }

    public void testTopKUnsortedArray() throws Exception{
        int[] array = new int[]{87, 1, 25, 23, 20, 86, 76, 92, 17, 31, 78, 56, 0, 31, 90, 88, 53, 24, 62, 26};
        int[] expected = new int[]{87, 1, 25, 23, 20, 86, 76, 92, 17, 31, 78, 56, 0, 31, 90, 88, 53, 24, 62, 26};
        Arrays.sort(expected);
        assertEquals(expected[0], SearchingUnsortedArray.topK(array, 0));
        assertEquals(expected[5], SearchingUnsortedArray.topK(array, 5));
        assertEquals(expected[12],SearchingUnsortedArray.topK(array, 12));
        assertEquals(expected[8], SearchingUnsortedArray.topK(array, 8));
    }
}
