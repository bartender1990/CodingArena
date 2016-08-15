package com.interview.leetcode.math;

import junit.framework.TestCase;

/**
 * Created_By: stefanie
 * Date: 14-11-18
 * Time: 上午7:16
 */
public class SingleNumberTest extends TestCase {
    public void testFindOne2() throws Exception {
        int[] num = new int[]{2,2,3,1,1};
        assertEquals(3, SingleNumber.findOne2(num));
    }

    public void testFindOne3() throws Exception {
        int[] num = new int[]{2,2,3,2};
        assertEquals(3, SingleNumber.findOne3(num));
    }

    public void testFindOneK() throws Exception {
        int[] num = new int[]{2,2,2,2,1,1,1,1,3};
        assertEquals(3, SingleNumber.findOneK(num, 4));
    }

    public void testFindTwo() throws Exception{
        int[] num = new int[]{2,2,1,1,3,4,5,5};
        int[] singleTwo = SingleNumber.findTwo2(num);
        //ConsoleWriter.printIntArray(singleTwo);
        assertTrue(singleTwo[0] == 3 || singleTwo[1] == 3);
        assertTrue(singleTwo[0] == 4 || singleTwo[1] == 4);
    }
}
