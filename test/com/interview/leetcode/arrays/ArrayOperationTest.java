package com.interview.leetcode.arrays;

import com.interview.utils.ConsoleWriter;
import junit.framework.TestCase;
import org.junit.Assert;

/**
 * Created_By: stefanie
 * Date: 14-11-17
 * Time: 下午8:12
 */
public class ArrayOperationTest extends TestCase {
    public void testRotateKStep() throws Exception {
        int[] array = new int[]{1,2,3,4,5};
        int[] expected = new int[]{4,5,1,2,3};
        ArrayOperation.rotateKStep(array, 3);
        //ArrayOperation.reverse(array, 3, 4);
        ConsoleWriter.printIntArray(array);
        Assert.assertArrayEquals(expected, array);

        array = new int[]{1,2,3,4,5,6};
        expected = new int[]{3,4,5,6,1,2};
        ArrayOperation.rotateKStep(array, 2);
        Assert.assertArrayEquals(expected, array);
    }

    public void testPartition(){
        int[] nums = new int[]{};
        assertEquals(0, ArrayOperation.partitionArray(nums, 9));
    }

}
