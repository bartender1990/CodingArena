package com.interview.leetcode.dp;

import junit.framework.TestCase;
import org.testng.Assert;

/**
 * Created_By: stefanie
 * Date: 14-11-26
 * Time: 上午10:44
 */
public class ZigZagSequenceTest extends TestCase {
    public void testLongest() throws Exception {
        OneSequenceDP.ZigZagSequence finder = new OneSequenceDP.ZigZagSequence();
        int[] array = new int[] { 374, 40, 854, 203, 203, 156, 362, 279, 812, 955, // 7 ok  812 ends    i = 9
                600, 947, 978, 46, 100, 953, 670, 862, 568, 188, // 13 ok  568 ends    (i=19)
                67, 669, 810, 704, 52, 861, 49, 640, 370, 908, // 21 ok 908 ends    (i=29)
                477, 245, 413, 109};
        //477, 245, 413, 109, 659, 401, 483, 308, 609, 120}; // 30 not ok
        Assert.assertEquals(finder.longest(array), 24);
    }
}
