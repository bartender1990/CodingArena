package com.interview.leetcode.arrays;

import com.interview.utils.ConsoleWriter;
import junit.framework.TestCase;

/**
 * Created_By: stefanie
 * Date: 14-11-15
 * Time: 下午5:38
 */
public class SubArrayTest extends TestCase {
    public void testMaxSum(){
        int[] array = new int[]{-2, -1};
        assertEquals(-1, SubArray.maxSumOptz(array));
    }

    public void testMaxRange(){
        int[] array = new int[]{-2, 1, -3,4, -1,2,1, -5,4};
        int[] range = SubArray.maxSumRange(array);
        assertEquals(3, range[1]);
        assertEquals(6, range[2]);
        assertEquals(6, range[0]);
    }

    public void testMinSum(){
        int[] nums = new int[]{1,2,-1};
        assertEquals(-1, SubArray.minSum(nums));
    }

    public void testMaxDifference(){
        int[] nums = new int[]{-4,-5};
        assertEquals(1, SubArray.maxDiffSubArrays(nums));
    }

    public void testSumZero(){
        int[] nums = new int[]{-2, 1, -3,4, -1,2,1, -5,4};
        int[] subarray = SubArray.sumZero(nums);
        ConsoleWriter.printIntArray(subarray);
        assertEquals(2,subarray[0]);
        assertEquals(4,subarray[1]);
    }

    public void testSumClosetZero(){
        int[] nums = new int[]{-2, 1, -3,4, -1,2,1, -5,4};
        int[] subarray = SubArray.sumClosetZero(nums);
        ConsoleWriter.printIntArray(subarray);
        assertEquals(0,subarray[0]);
        assertEquals(2,subarray[1]);
        assertEquals(4,subarray[2]);
    }

    public void testMaxSumMatrix(){
        int[][] matrix = new int[4][];
        matrix[0] = new int[]{0, -2, -7, 0};
        matrix[1] = new int[]{9,  2, -6, 2};
        matrix[2] = new int[]{-4, 1, -4, 1};
        matrix[3] = new int[]{-1, 8, 0, -2};
        assertEquals(15, SubArray.maxSum(matrix));
    }

    public void testMaxProduct() throws Exception {
        int[] array = new int[]{7,-2,-4};
        assertEquals(56, SubArray.maxProduct(array));
    }
}
